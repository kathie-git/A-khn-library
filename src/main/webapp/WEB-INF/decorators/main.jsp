<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ include file="/WEB-INF/urls.jspf" %>


<html>
  <head>
    <title>khn Library - <decorator:title /></title>
    <style>
		.form-item { margin: 20px 0; }
		.form-label { font-weight: bold; }
		.error-message {margin: 20px auto; font-weight: bold; color: red; }		
    td.label { text-align: right; }
    td.value { text-align: left; font-weight: bold; }
    
    #subhd {
    border-top: 1px solid #333;
    padding: 1px 0;
    background-color: #333;
	background: -moz-linear-gradient(100% 100% 90deg, #333, #555);
	background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#555), to(#333));
	font-size: 15px;
    color: #EEE;
    line-height: 1.0;
}
#innerHdSubhd {
	-moz-box-shadow: 0 2px 5px #666;
	-webkit-box-shadow: 0 2px 5px #666;
	box-shadow: 0 2px 5px #666;
}

#hd, #subhd, #bd, #ft {
	font-family: Mako, sans-serif;
	font-size: 116%;
}

#hd {
	padding: 15px 20px 10px;
	background-color: #537A8A;
	color: #FFF;
}

#hdTitle {
	position: relative;
	left: 2px;
	width: 140px;
	height: 17px;
	background: url(images/sip-title.png) no-repeat;
}

#hdAppName {
	font-size: 250%;
}
.regionInner {
	width: 840px;
	margin: 0 auto;
	padding: 0 20px;
}
#legal {
	margin: 40px 0;
    text-align: center;
}
output, input, textarea, button {
	border: 0;
	padding: 2px;
	background-color: #FFF;
	font-family: Mako, sans-serif;
}#ft {
	border-top: 4px solid #505759;
	text-align: left;
	color: #80FFE6;
}
}
</style>		
	</style>
  </head>
  <body>
<div id="innerHdSubhd">
					<div id="hd">
						<div id="hdTitle"></div>
						<div id="hdAppName"><c:out value="${initParam.appName}" /></div>
					</div>
	<div id="subhd">
	<div id="topNav">
		<ul>
			<li><a href="${homeUrl}">Home</a></li>
			<li><a href="${contactListUrl}">Contacts</a></li>
		</ul>
	</div>
</div>
</div>
    <div id="header">
       <h1>khn Library</h1>
    </div>
    <div id="main">
      <decorator:body />
    </div>
    <div id="ft">
				<div class="regionInner">
					<div id="legal">
						Copyright &copy; 2014 khn.
					</div>
				</div>
			</div>
		</div>
  </body>
</html>