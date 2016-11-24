<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<style type="text/css">
.foo {font-family:  "Arial Black" ;
  text-shadow: 0.66913px 0.74314px 0 #16a085, 1.33826px 1.48629px 0 #16a185, 2.00739px 2.22943px 0 #16a186, 2.67652px 2.97258px 0 #16a186, 3.34565px 3.71572px 0 #16a186, 4.01478px 4.45887px 0 #16a286, 4.68391px 5.20201px 0 #16a287, 5.35304px 5.94516px 0 #16a287, 6.02218px 6.6883px 0 #16a387, 6.69131px 7.43145px 0 #16a387, 7.36044px 8.17459px 0 #16a388, 8.02957px 8.91774px 0 #16a388, 8.6987px 9.66088px 0 #17a488, 9.36783px 10.40403px 0 #17a488, 10.03696px 11.14717px 0 #17a488, 10.70609px 11.89032px 0 #17a489, 11.37522px 12.63346px 0 #17a589, 12.04435px 13.37661px 0 #17a589, 12.71348px 14.11975px 0 #17a589, 13.38261px 14.8629px 0 #17a68a, 14.05174px 15.60604px 0 #17a68a, 14.72087px 16.34919px 0 #17a68a, 15.39px 17.09233px 0 #17a68a, 16.05913px 17.83548px 0 #17a78b, 16.72827px 18.57862px 0 #17a78b, 17.3974px 19.32177px 0 #17a78b, 18.06653px 20.06491px 0 #17a88b, 18.73566px 20.80806px 0 #17a88b, 19.40479px 21.5512px 0 #17a88c, 20.07392px 22.29434px 0 #17a88c, 20.74305px 23.03749px 0 #17a98c, 21.41218px 23.78063px 0 #17a98c, 22.08131px 24.52378px 0 #17a98d, 22.75044px 25.26692px 0 #17aa8d, 23.41957px 26.01007px 0 #17aa8d, 24.0887px 26.75321px 0 #17aa8d, 24.75783px 27.49636px 0 #17aa8e, 25.42696px 28.2395px 0 #18ab8e, 26.09609px 28.98265px 0 #18ab8e, 26.76522px 29.72579px 0 #18ab8e, 27.43435px 30.46894px 0 #18ab8e, 28.10349px 31.21208px 0 #18ac8f, 28.77262px 31.95523px 0 #18ac8f, 29.44175px 32.69837px 0 #18ac8f, 30.11088px 33.44152px 0 #18ad8f, 30.78001px 34.18466px 0 #18ad90, 31.44914px 34.92781px 0 #18ad90, 32.11827px 35.67095px 0 #18ad90, 32.7874px 36.4141px 0 #18ae90, 33.45653px 37.15724px 0 #18ae91, 34.12566px 37.90039px 0 #18ae91, 34.79479px 38.64353px 0 #18af91, 35.46392px 39.38668px 0 #18af91, 36.13305px 40.12982px 0 #18af91, 36.80218px 40.87297px 0 #18af92, 37.47131px 41.61611px 0 #18b092, 38.14044px 42.35926px 0 #18b092, 38.80958px 43.1024px 0 #18b092, 39.47871px 43.84554px 0 #18b193, 40.14784px 44.58869px 0 #18b193, 40.81697px 45.33183px 0 #18b193, 41.4861px 46.07498px 0 #18b193, 42.15523px 46.81812px 0 #19b293, 42.82436px 47.56127px 0 #19b294, 43.49349px 48.30441px 0 #19b294, 44.16262px 49.04756px 0 #19b294, 44.83175px 49.7907px 0 #19b394, 45.50088px 50.53385px 0 #19b395, 46.17001px 51.27699px 0 #19b395, 46.83914px 52.02014px 0 #19b495, 47.50827px 52.76328px 0 #19b495, 48.1774px 53.50643px 0 #19b496, 48.84653px 54.24957px 0 #19b496, 49.51566px 54.99272px 0 #19b596, 50.1848px 55.73586px 0 #19b596, 50.85393px 56.47901px 0 #19b596, 51.52306px 57.22215px 0 #19b697, 52.19219px 57.9653px 0 #19b697, 52.86132px 58.70844px 0 #19b697, 53.53045px 59.45159px 0 #19b697, 54.19958px 60.19473px 0 #19b798, 54.86871px 60.93788px 0 #19b798, 55.53784px 61.68102px 0 #19b798, 56.20697px 62.42417px 0 #19b898, 56.8761px 63.16731px 0 #19b899, 57.54523px 63.91045px 0 #19b899, 58.21436px 64.6536px 0 #19b899, 58.88349px 65.39674px 0 #1ab999, 59.55262px 66.13989px 0 #1ab999, 60.22175px 66.88303px 0 #1ab99a, 60.89089px 67.62618px 0 #1ab99a, 61.56002px 68.36932px 0 #1aba9a, 62.22915px 69.11247px 0 #1aba9a, 62.89828px 69.85561px 0 #1aba9b, 63.56741px 70.59876px 0 #1abb9b, 64.23654px 71.3419px 0 #1abb9b, 64.90567px 72.08505px 0 #1abb9b, 65.5748px 72.82819px 0 #1abb9c, 66.24393px 73.57134px 0 #1abc9c, 66.91306px 74.31448px 0 #1abc9c;
}

.bar {
  box-shadow: -0.15em 0em 0 #2b80b7, -0.3em 0em 0 #2d80b6, -0.45em 0em 0 #2f80b4, -0.6em 0em 0 #3180b3, -0.75em 0em 0 #3280b1, -0.9em 0em 0 #3480b0, -1.05em 0em 0 #3680ae, -1.2em 0em 0 #3880ad, -1.35em 0em 0 #3a80ab, -1.5em 0em 0 #3c80aa, -1.65em 0em 0 #3e80a8, -1.8em 0em 0 #4080a7, -1.95em 0em 0 #4280a5, -2.1em 0em 0 #4380a4, -2.25em 0em 0 #4580a2, -2.4em 0em 0 #4780a1, -2.55em 0em 0 #49809f, -2.7em 0em 0 #4b809e, -2.85em 0em 0 #4d809c, -3em 0em 0 #4f809b, -3.15em 0em 0 #518099, -3.3em 0em 0 #538098, -3.45em 0em 0 #548096, -3.6em 0em 0 #568095, -3.75em 0em 0 #588093, -3.9em 0em 0 #5a7f92, -4.05em 0em 0 #5c7f90, -4.2em 0em 0 #5e7f8f, -4.35em 0em 0 #607f8d, -4.5em 0em 0 #627f8c, -4.65em 0em 0 #647f8a, -4.8em 0em 0 #657f89, -4.95em 0em 0 #677f87, -5.1em 0em 0 #697f86, -5.25em 0em 0 #6b7f84, -5.4em 0em 0 #6d7f83, -5.55em 0em 0 #6f7f81, -5.7em 0em 0 #717f80, -5.85em 0em 0 #737f7e, -6em 0em 0 #757f7d, -6.15em 0em 0 #767f7b, -6.3em 0em 0 #787f7a, -6.45em 0em 0 #7a7f78, -6.6em 0em 0 #7c7f77, -6.75em 0em 0 #7e7f75, -6.9em 0em 0 #807f74, -7.05em 0em 0 #827f72, -7.2em 0em 0 #847f71, -7.35em 0em 0 #867f6f, -7.5em 0em 0 #887f6e, -7.65em 0em 0 #897f6c, -7.8em 0em 0 #8b7f6a, -7.95em 0em 0 #8d7f69, -8.1em 0em 0 #8f7f67, -8.25em 0em 0 #917f66, -8.4em 0em 0 #937f64, -8.55em 0em 0 #957f63, -8.7em 0em 0 #977f61, -8.85em 0em 0 #997f60, -9em 0em 0 #9a7f5e, -9.15em 0em 0 #9c7f5d, -9.3em 0em 0 #9e7f5b, -9.45em 0em 0 #a07f5a, -9.6em 0em 0 #a27f58, -9.75em 0em 0 #a47f57, -9.9em 0em 0 #a67f55, -10.05em 0em 0 #a87f54, -10.2em 0em 0 #aa7f52, -10.35em 0em 0 #ab7f51, -10.5em 0em 0 #ad7f4f, -10.65em 0em 0 #af7f4e, -10.8em 0em 0 #b17f4c, -10.95em 0em 0 #b37f4b, -11.1em 0em 0 #b57f49, -11.25em 0em 0 #b77f48, -11.4em 0em 0 #b97e46, -11.55em 0em 0 #bb7e45, -11.7em 0em 0 #bc7e43, -11.85em 0em 0 #be7e42, -12em 0em 0 #c07e40, -12.15em 0em 0 #c27e3f, -12.3em 0em 0 #c47e3d, -12.45em 0em 0 #c67e3c, -12.6em 0em 0 #c87e3a, -12.75em 0em 0 #ca7e39, -12.9em 0em 0 #cc7e37, -13.05em 0em 0 #cd7e36, -13.2em 0em 0 #cf7e34, -13.35em 0em 0 #d17e33, -13.5em 0em 0 #d37e31, -13.65em 0em 0 #d57e30, -13.8em 0em 0 #d77e2e, -13.95em 0em 0 #d97e2d, -14.1em 0em 0 #db7e2b, -14.25em 0em 0 #dd7e2a, -14.4em 0em 0 #de7e28, -14.55em 0em 0 #e07e27, -14.7em 0em 0 #e27e25, -14.85em 0em 0 #e47e24, -15em 0em 0 #e67e22;
}

.baz {
  box-shadow: -9.82982px -6.88292px 0 rgba(142, 68, 173, 0.9), -19.65965px -13.76583px 0 rgba(142, 68, 173, 0.8), -29.48947px -20.64875px 0 rgba(142, 68, 173, 0.7), -39.3193px -27.53167px 0 rgba(142, 68, 173, 0.6), -49.14912px -34.41459px 0 rgba(142, 68, 173, 0.5), -58.97895px -41.2975px 0 rgba(142, 68, 173, 0.4), -68.80877px -48.18042px 0 rgba(142, 68, 173, 0.3), -78.6386px -55.06334px 0 rgba(142, 68, 173, 0.2), -88.46842px -61.94626px 0 rgba(142, 68, 173, 0.1), -98.29825px -68.82917px 0 rgba(142, 68, 173, 0);
}

.foo {
  font-family: 'Raleway', sans-serif;
  color: white;
  line-height: 100vh;
  font-size: 10em;
  margin: auto;
  text-align: center;
}

.bar, .baz {
  height: 10em;
  margin: auto;
}

.bar {
  width: 10em;
  border-radius: 50%;
  background: #3498db;
}

.baz {
  width: 20em;
  background: #f39c12;
  border-radius: .25em;
}

section {
  height: 100vh;
  background: #1abc9c;
  display: -webkit-box;
  display: -webkit-flex;
  display: -ms-flexbox;
  display: flex;
}

section + section {
  background: #e67e22;
}

section + section + section {
  background: #9b59b6;
}

</style>
<script type="text/javascript" src="../scripts/jquery-1.7.1.min.js"></script>
</head>
<body>
<section>
  <div class="foo">后台报错：${error}</div>
</section>
</body>
</html>
