set projectLocation=D:\seleniumTrg_ws\Day_MFW_105
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
javaorg.testng.TestNG %projectLocation%\testng.xml