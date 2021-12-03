# WorldBorder (Pure's Fork)

**Compatible with Minecraft 1.13+ (Tested on Minecraft 1.18)**

This is a continuation / maintained version of the original plugin created by BrettFlan.

The goal of this project is to maintain the original projects fully working operation and add new features to improve upon the ideas
and philosophies of the original project.

## What's different?

This is a list of everything that has been altered from the original from a users perspective:
* The world generation fill speed has been significantly increased (at the cost of more memory usage)
* Improvements have been made to better preserving fill progress between restarts / crashes
* Fixes involving height issues and teleports for border checking tasks
* Auto resume for the world generation fill task will now work properly with worlds loaded by [Multiverse-Core](https://www.spigotmc.org/resources/multiverse-core.390/) & [Hyperverse](https://www.spigotmc.org/resources/hyperverse-w-i-p.77550/)
* An incompatibility between Java 8 and Java 9+ was resolved
* Ability to bypass the worldborder via permission `worldborder.allowbypass` as an alternative to the bypass list

This project is a direct drop in replacement for the original. You can upgrade without any loss or worries.

## How do I obtain it?

You can download stable releases via Github Releases, [located here.](https://github.com/Puremin0rez/WorldBorder/releases)

You can download development builds via Github Actions, [located here.](https://github.com/Puremin0rez/WorldBorder/actions?query=branch%3Amaster+is%3Asuccess) (Github Account Required)

You can compile it by running the following command in the project directory:

```
./gradlew clean build
```

(The jar file will be located in `/build/libs/`)

## Can I use your code?

The original project, and therefore this project, is licensed as [BSD 2-Clause "Simplified" License](https://github.com/Puremin0rez/WorldBorder/blob/master/LICENSE)

## Acknowledgements

* [BrettFlan](https://github.com/Brettflan) for creating the true and tested [WorldBorder](https://github.com/Brettflan/WorldBorder) project that server admins have relied on for years.
* [Contributors](https://github.com/Puremin0rez/WorldBorder/graphs/contributors) for helping improve the project.
* You, for reading this and checking out the project.
