const curl = new (require( 'curl-request' ))();

curl.setHeaders([
    'user-agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36'
])
    .get('http://eacodingtest.digital.energyaustralia.com.au/api/v1/festivals')
    .then(({statusCode, body, headers}) => {
        /*let jsonRaw = "[{\"name\":\"LOL-palooza\",\"bands\":[{\"name\":\"Winter Primates\",\"recordLabel\":\"\"},{\"name\":\"Jill Black\",\"recordLabel\":\"Fourth Woman Records\"},{\"name\":\"Werewolf Weekday\",\"recordLabel\":\"XS Recordings\"},{\"name\":\"Frank Jupit\n" +
            "er\",\"recordLabel\":\"Pacific Records\"}]},{\"name\":\"Small Night In\",\"bands\":[{\"name\":\"The Black Dashes\",\"recordLabel\":\"Fourth Woman Records\"},{\"name\":\"Wild Antelope\",\"recordLabel\":\"Marner Sis. Recording\"},{\"name\":\"Gre\n" +
            "en Mild Cold Capsicum\",\"recordLabel\":\"Marner Sis. Recording\"},{\"name\":\"Yanke East\",\"recordLabel\":\"MEDIOCRE Music\"},{\"name\":\"Squint-281\",\"recordLabel\":\"Outerscope\"}]},{\"name\":\"Trainerella\",\"bands\":[{\"name\":\"Adrian\n" +
            "Venti\",\"recordLabel\":\"Monocracy Records\"},{\"name\":\"Manish Ditch\",\"recordLabel\":\"ACR\"},{\"name\":\"YOUKRANE\",\"recordLabel\":\"Anti Records\"},{\"name\":\"Wild Antelope\",\"recordLabel\":\"Still Bottom Records\"}]},{\"name\":\"Twist\n" +
            "ed Tour\",\"bands\":[{\"name\":\"Squint-281\"},{\"name\":\"Summon\",\"recordLabel\":\"Outerscope\"},{\"name\":\"Auditones\",\"recordLabel\":\"Marner Sis. Recording\"}]},{\"bands\":[{\"name\":\"Propeller\",\"recordLabel\":\"Pacific Records\"},{\"na\n" +
            "me\":\"Critter Girls\",\"recordLabel\":\"ACR\"}]}]\n";*/
        displayBody(body);
    })
    .catch((e) => {
        console.log(e);
    });

var display = [];

function displayBody(json){
    console.log(json);
    ///////////////////////
    var obj = JSON.parse(json);

    obj.forEach(function (festival) {
       // console.log(festival.bands)

            festival.bands.forEach(function (band){
          //  console.log(band)
         //       console.log('/////')
                let entry = {recordLabel: band.recordLabel,                             //this inverts the structure fest>band>record
                                                                                        //to rec>band>fest = which is in display array
                                    bands: [{
                                            band: band.name,
                                            festivals: [{festivalName: festival.name}]
                                            }
                                        ]
                            }


               display.forEach(function (record){
                 //  console.log(record.recordLabel)
                   if(record.recordLabel === entry.recordLabel){
                       record.forEach(function(band){
                           if(record.bands[band].band === entry.bands[band].band){
                               record.bands[band].festivals.push(entry.bands[band].festivals)       //add festival if record label and band already exist
                           }
                       })
                       record.bands.push(entry.bands)                                               //if not we then add the band with its inner festival array to record

                   }

               })
            display.push(entry)                                                                     //otherwise add entry....will delete duplicates later finding work around

        })


    })
    let uniqueDisplay = display.filter(function(elem, pos){
        return display.indexOf(elem)==pos

    })

// now lets sort record label alphabetical

    uniqueDisplay.sort(function(a, b){                          //sorted display listed
        var keyA = a.name,
            keyB = b.name;
        // Compare the 2 dates
        if(keyA < keyB) return -1;
        if(keyA > keyB) return 1;
        return 0;
    });

//finally lets display list
console.log('.............')
    uniqueDisplay.forEach(function(recordlab){
       // uniqueDisplay.toString();
       console.log(recordlab.recordLabel )

        recordlab[recordlab.name].bands.forEach(function(band){                         //prints out content in manner
            console.log(band.name)

            band.festivals.forEach(function (fest){
                console.log(fest.festivalName)

            } )
        })


    })


}