
### Objective: 
Keep enemies from getting past your defensive walls by blasting them away with missiles. Kill as many zombies possible, get all the points you can, and SURVIVE. 

### Instructions: 
Place Walls in various locations in the most strategic manner possible. As enemies come, use each wall that was placed to stop them from destroying the walls and getting by. To earn points kill enemies. To earn resources in order to buy tower upgrades, and ammo,  survive. As time passes resources will increase along with enemy kills. 

### Future Work: 
Lose Condition
Highscore Database Finished
Tower Placement Finished
Disparate Products Merged
Tower Upgrades
Diversity in Enemies and Towers
Multiple Rounds with different spawning routines.
Enemy & Tower Logic and AI
App Store Deployment
Add Multiplayer capability for online play, and leaderboards.

### Team Members Work: 
Each team member played a part in just about every aspect of the project. Although the following describes the high points of what each team member accomplished:

**Steve Gilland** - Main Menu, GUI, Game Loop, Passive Resource and Point Scoring, Screen and Scene Management. 
**John Reach** - Tiled map/gameboard system. Wall placement, wall collision, TMX file maps
**Ohki Hirano** -  Zombie, and Zombie Management. Demo Work.
**Cade McDougal**- Setting up Database and integrating it into the project. Original game board/map, Tower/Missiles. Worked with Ohki on Demo Code.

#### Experiences: 
These consists of game development in general for most in our group. This involved learning libraries to deal with the graphics of the game. One of the main challenges involved with our project was getting the environment set up, and getting it to work on everyone’s machine correctly. Git was another challenge for some of us, but not for all. Luckily some team members were fluent enough to show the others who were not so well with Git.

#### Binary Installation:
Retrieve Binary from releases tab of github project: https://github.com/Orianas/aliens/releases/
Run included JAR file.

#### Setting up the Development Environment:
We chose to use the JetBrains IntelliJ IDEA. As students, we were able to obtain a license for the professional version. We also decided to use the LibGDX Java game engine

If you were to start a new LibGDX Project, your first step would be to download the setup app from https://libgdx.badlogicgames.com/download.html. This simple app will create a new gradle file (Java build tool such as Apache ANT) for a new libgdx project. You can select if you would like the project on run on Android, Desktop, iOS, and HTML. You can also choose from popular add on packages, such a particle engine.
The next step is to open the build.gradle file, either the one you just created or an existing project such as ours, into your IDE. In our case, IntelliJ. File -> Open -> build.gradle. 
Next you’ll want to set your java sdk and android sdk (optional for some projects, but required for ours) by right clicking on the project in IntelliJ -> Open Module Settings. Click on SDKs, click the “+” button and select JDK. Then add find the directory to your java SDK and select it. Repeat this step for the android SDK.
Now, we must select our main class when running the program. Select Run -> Edit Configurations -> Click the “+” button and select “Application”. In the Main Class field, choose "com.project.alien.desktop.DesktopLauncher”. If you are also developing for android, set the working directory to “C:\JavaAliens\android\assets”. Under “Use Classpath of Module” select the desktop module.
Update the gradle build file and dependencies. Select View -> Gradle -> then hit the refresh button. 
You should now be reading to run our project!
