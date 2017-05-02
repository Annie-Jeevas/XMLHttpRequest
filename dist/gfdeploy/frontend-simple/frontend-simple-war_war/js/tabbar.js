var sideWidth = document.documentElement.clientHeight / 20;
            var tabsNumber = 4;
            var tabbar = {
                view: "segmented",
                id: 'tabbar',
                value: 'listView',
                multiview: true,
                optionWidth: document.documentElement.clientWidth / tabsNumber,
                align: "center",
                padding: 5,
                options: [
                    {value: 'Sportsmen', id: 'listSportsmen', selected:true},
                    {value: 'Current Race', id: 'currentRace'},
                    {value: 'Last races results', id: 'archiveRaces'},
                    {value: 'Next Races', id: 'nextRaces'}
                ]
            };