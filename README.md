# STC-Alexa-Framework

This code is basically a library to use for ease of creation of Alexa skills. I would reccomend glancing over the [**Getting Started with the Alexa Skills Kit**.](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/getting-started-guide) Browse through the various chapters to get a good grasp on what an Alexa Skill should contain, act, and feel like.

## Prerequisites
* [**Eclipse Neon Java IDE**](https://www.eclipse.org/downloads/)
* Some Programming Experience
* Some Maven Experience
* Familar with Java syntax
* Familar with Git
* [**Git Bash** (If on Windows)](https://git-scm.com/downloads)
* Positive Attitude

## Getting Started

After installing Eclipse, go ahead and fire it up. Once Eclipse is fully loaded, you'll need to clone this framework to your workspace. To do this, open up Git Bash or your console and navigate to your workspace location, this will normally be under /users/USERNAME/workspace. If you are on a Linux distro or Mac OSx, Eclipse will tell you the default workspace directory path when it launches. 

You will then clone this repostitory with:
	
    git clone git@github.com:Student-Technology-Center/STC-Alexa-Framework.git
    
Afterwards, in the Eclipse IDE enviornment, you'll navigate to File > Import Project > Exisiting Maven Projects. If you don't see any projects show up, go ahead and click the root directory bar and select your workspace and import the STC-Alexa-Framework in. Once you see your project on the package explorer, right click it Run As > Maven Install. Once it's done building, you can now go to the section **Building Your Skill**!

## Getting Started 1.1
If you are already familar with Maven, Git, and Java, go ahead and clone this repository anywhere you like and run mvn install on it. If you don't know what this means, please use the main **Getting Started section**.

## Building Your App
Once you have sucesfully 'installed' the framework, you are ready to create a Skill! Go ahead and create a new Maven Project by going to File > New > Project, and select Maven Project. Go ahead and select the checkbox "Create a simple project" and click next.

Your GroupId is a marker of your skill, [**this**](https://maven.apache.org/guides/mini/guide-naming-conventions.html) is how you *should* name it.

Name your skill with Artifact Id, afterwards you can click finish.

### Importing the Framework
Once your project is created, you'll see a pom.xml file. Edit that and anywhere between the *project* brackets, paste:

	<dependencies>
		<!-- https://mvnrepository.com/artifact/com.amazon.alexa/alexa-skills-kit -->
		<dependency>
			<groupId>com.amazon.alexa</groupId>
			<artifactId>alexa-skills-kit</artifactId>
			<version>1.2</version>
			<scope>compile</scope>
			<type>jar</type>
		</dependency>
		<dependency>
			<groupId>edu.wwu.center.studenttechnology</groupId>
			<artifactId>STC-Alexa-Framework</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			<scope>compile</scope>
		</dependency>
	</dependencies>
    
// TODO: Finish the rest

## Helpful Links

* [**Voice Design**](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/defining-the-voice-interface)
* [**SSML**](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/speech-synthesis-markup-language-ssml-reference)
