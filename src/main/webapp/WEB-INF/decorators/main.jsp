<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<html>
  <head>
    <title>khn Library - <decorator:title /></title>
    <link rel="stylesheet" type="text/css" href="sip.css">
    <!-- <style>
		.form-item { margin: 20px 0; }
		.form-label { font-weight: bold; }
		.error-message {margin: 20px auto; font-weight: bold; color: red; }		
    td.label { text-align: right; }
    td.value { text-align: left; font-weight: bold; }
</style>	 -->	
	</style>
  </head>
  <body>
    <div id="header">
       <h1>khn Library</h1>
    </div>
    <div id="main">
      <decorator:body />
    </div>
    <div id="footer">
    	<br/>
    	<br/>
    	<br/>
    	<br/>
        &copy;  2011 <a href="">khn Library</a> 
    </div>
  </body>
</html>