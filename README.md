# Research Mentorship Backend

Springboot and MongoDB backend of [DEV](https://osu.dev)'s unique solution that aggregates all the research opportunities on campus for all majors and departments. **Key features include:**

- Latest listings of student research positions,
- Administrative access for OSU faculties,
- And so much more...

This student project is made with passion and :heart:  by:

- [Bennett Godinho-Nelson](bennettgodinhonelson@gmail.com) as Sr SWE
- [D'Andre Williams](dwilliamsbuckeye@gmail.com) as Sr SWE
- [Suyeon Chae](schae0103@gmail.com) as Jr SWE
- [Alex Eichner](eichneralex3@gmail.com) as Jr SWE
- [Connor Radkov](cradkov27@gmail.com) as Jr SWE
- [Jerry Chang](jerry091401@gmail.com) as Jr SWE
- [Max Miller](millermax98765@gmail.com) as Jr SWE

Documented on 03/21/24 by Keming He as the DevOps consultant for this project. Connect with me at https://linkedin.com/in/keminghe :star:

## Quick Start

> [!NOTE]
> 
> For demonstration purposes, TODO: add illustration of backend routing and database design diagrams here.

> [!IMPORTANT]
>
> For common troubleshooting, as well as issue submission, please go to our issue board:
>
> https://github.com/devosu/research-mentorship-backend/issues

## For Developers

### 0. Git, Java, and Maven Set Up

Install the latest version of git version control on your local dev environment. 

> Official link: https://git-scm.com/downloads

Install **Bellsoft's Java 17 LTS**, we need an exact match this time. 

> Official link: https://bell-sw.com/pages/downloads/#jdk-17-lts

Install the latest version of Maven on your local dev environment. 

> Official link: https://maven.apache.org/users/index.html

Run these commands in a terminal/cmd/powershell to confirm installation success:

```bash
git --version
mvn --version   # Not 'maven' in full
```

You should see something printed out such as:

```bash
git version 2.34.1                          # For git (ver varies)
Apache maven 3.6.3                          # For Maven (ver varies)
Maven home: ...
Java version: 17.0.10, vendor: BellSoft,... # For Java (must be 17)
...
```

### 1. Clone the Repository 

Open any termial and run:

```bash
git clone https://github.com/devosu/research-mentorship-backend.git
```

> [!TIP]
> 
> If you are a admin or contrib member of this repo, you should be able to clone it. 
> 
> For `Access Denied` issues, please first consult: https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens then @ any Officer in our Discord.

Once successfully cloned our repo, make sure to enter and create your own feature branch:

```bash
cd research-mentorship-backend
git pull
git checkout -b dev-feature_name-your_name
```

Yeah!! :smiley: You are now ready! Let's give the server a test run, shall we? By default, the backend is packaged to the `target` directory; and the server is hosted to `https://localhost:8080`.

```bash
# Replace YOUR_PACKAGED_JAR with the actual name of the .jar file.
set -e; mvn clean; mvn package; java -jar target/YOUR_PACKEGED_JAR.jar
```

### 2. Let's Build

D'Andre, the floor is yours.

## Setting up MongoDB Connection 

Documented on 03/27/24 by D'Andre Williams as the Sr. Software Engineer for this project. Connect with me at https://www.linkedin.com/in/d%E2%80%99andre-williams-0138501a5/ :star:


In MongoDB, in the database tab next to ResearchMentorship project name you will see a button that says "connect". Once you press "connect" go the option that says "MongoDB for VS Code". Under the "Connect to your MongoDB deployment" section copy the link of your personal connection string. Note that you will need to insert your password into this string. 

Now, we will use the string to create an environment variable on your personal device. 

Windows devices: 
In the terminal of your IDE type the following command: 
set MONGODB_URI=mongodb+srv://<username>:<password>@<host>/<database>
replacing the URI with your personal connection string. 

To verify the environment variable type the following command:
echo %MONGODB_URI%


Linux/macOS:
In the terminal of your IDE type the following command:
export MONGODB_URI="mongodb+srv://<username>:<password>@<host>/<database>"
replacing the URI with your personal connection string. 

To verify the environment variable type the following command:
echo $MONGODB_URI

Now that your connection string is stored as an environment variable, you will be able to access the database without changing any configuration code in the backend, and you're credentials will be secure and unaccesible from the repository. 









Happy Developing Everyone!
