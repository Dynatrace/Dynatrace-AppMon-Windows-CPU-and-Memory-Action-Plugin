<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Windows CPU and Memory Action Plugin</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
    <meta content="Scroll Wiki Publisher" name="generator"/>
    <link type="text/css" rel="stylesheet" href="css/blueprint/liquid.css" media="screen, projection"/>
    <link type="text/css" rel="stylesheet" href="css/blueprint/print.css" media="print"/>
    <link type="text/css" rel="stylesheet" href="css/content-style.css" media="screen, projection, print"/>
    <link type="text/css" rel="stylesheet" href="css/screen.css" media="screen, projection"/>
    <link type="text/css" rel="stylesheet" href="css/print.css" media="print"/>
</head>
<body>
                <h1>Windows CPU and Memory Action Plugin</h1>
    <div class="section-2"  id="114557279_WindowsCPUandMemoryActionPlugin-Overview"  >
        <h2>Overview</h2>
    <p>
    </p>
            <img src="images_community/download/attachments/114557279/icon.png" alt="images_community/download/attachments/114557279/icon.png" class="confluence-embedded-image" />
            <p>
The Action plugin will send an email with Process and CPU information about a Windows System via PS Tools. The plugin is hard coded to look at the pslist command at C:\PSTools\pslist.exe on the dynaTrace Server.    </p>
    <p>
    </p>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/114557279/Email_Example.jpg" alt="images_community/download/attachments/114557279/Email_Example.jpg" class="" />
            </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
            <img src="images_community/download/attachments/114557279/CPU_and_Memory_Action_Email.jpg" alt="images_community/download/attachments/114557279/CPU_and_Memory_Action_Email.jpg" class="" />
            </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
                </td>
                <td rowspan="1" colspan="1">
                </td>
        </tr>
</tbody>        </table>
            </div>
    <p>
    </p>
    </div>
    <div class="section-2"  id="114557279_WindowsCPUandMemoryActionPlugin-PluginDetails"  >
        <h2>Plugin Details</h2>
    <div class="tablewrap">
        <table>
<thead class=" "></thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
Plug-In Versions    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="attachments_114688051_1_com.mycompany.myplugin_1.0.0.jar">Windows CPU and Memory Action Plugin 1.0.0</a> (compatible with dynaTrace 4.2+)    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Author    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Derek Abing    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
License    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="attachments_5275722_2_dynaTraceBSD.txt">dynaTrace BSD</a>    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Support    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
<a href="https://community/display/DL/Support+Levels#SupportLevels-Community">Not Supported </a><br/>If you have any questions or suggestions for these plugins, please add a comment to this page, use our <a href="https://community.dynatrace.com/community/pages/viewpage.action?pageId=46628918">forum</a>, or drop us an email at <a href="mailto:apmcommunity@compuware.com">apmcommunity@compuware.com</a>!    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Known Problems    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Release History    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
2013-03-12 Initial Release    </p>
            </td>
        </tr>
</tbody>        </table>
            </div>
    </div>
    <div class="section-2"  id="114557279_WindowsCPUandMemoryActionPlugin-Configuration"  >
        <h2>Configuration</h2>
    <div class="tablewrap">
        <table>
<thead class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
Name    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Value    </p>
            </td>
        </tr>
</thead><tfoot class=" "></tfoot><tbody class=" ">    <tr>
            <td rowspan="1" colspan="1">
        <p>
Type    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
What type of information to include.    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
To    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Email Address to send the email to. For multiple email address seperate by a ';'.    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
From    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Email address for the message to be sent from.    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Subject    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Subject of the email will be in the format of: &lt;server&gt; High &lt;Type&gt; @ &lt;time&gt; &lt;Subject input&gt;.    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
MailServer    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Address of the mail server to use for the email.    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
MailPort    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
Port on the mail server to use.    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
User    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
The Username to use for remote access.    </p>
            </td>
        </tr>
    <tr>
            <td rowspan="1" colspan="1">
        <p>
Pass    </p>
            </td>
                <td rowspan="1" colspan="1">
        <p>
The Password to use for remote access.    </p>
            </td>
        </tr>
</tbody>        </table>
            </div>
    </div>
    <div class="section-2"  id="114557279_WindowsCPUandMemoryActionPlugin-Installation"  >
        <h2>Installation</h2>
    <p>
Import the Plugin into the dynaTrace Server. For details how to do this please refer to the <a href="https://community.dynatrace.com/community/display/DOCDT50/Manage+and+Develop+Plugins#ManageandDevelopPlugins-ManageandDevelopPlugins">dynaTrace documentation</a>.    </p>
    </div>
            </div>
        </div>
        <div class="footer">
        </div>
    </div>
</body>
</html>
