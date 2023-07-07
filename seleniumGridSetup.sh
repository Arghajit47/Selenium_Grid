#!/bin/bash
java -Dwebdriver.chrome.driver="chromedriver" -jar selenium-server-standalone-3.5.3.jar -role node -hub http://172.18.0.1:4444/grid/register
