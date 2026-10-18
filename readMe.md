# Lubru-RPGPlugin

A Minecraft RPG plugin that adds RPG mechanics, character progression, and combat-based experience to your server.

## Description

**Lubru-RPGPlugin** is a Minecraft plugin designed to bring RPG elements to your server. Players can earn experience by defeating hostile mobs, level up their characters, and develop their stats to improve their abilities.

The plugin currently includes an RPG command system, experience points, levels, and four different character attributes: Strength, Intelligence, Defence, and Dexterity.

This is an ongoing project, with more features planned for future updates, including character classes, ranks, custom items, and additional mobs with unique experience rewards.

## Features

### Implemented
- `/rpg` command to access RPG features
- Experience (XP) system
- Player leveling system
- Strength attribute
- Intelligence attribute
- Defence attribute
- Dexterity attribute
- Zombies and skeletons grant XP when defeated
- Players can level up by earning enough XP

### Planned Features
- Character classes with different playstyles
- Player ranks and progression
- Custom RPG items
- More mobs with different XP rewards
- Additional RPG mechanics and gameplay improvements

## Getting Started

### Dependencies

Before installing the plugin, make sure you have:

- A Minecraft server compatible with the plugin's target version
- A compatible server software, such as Paper or Spigot
- Java installed and configured for your Minecraft server
- The Lubru-RPGPlugin `.jar` file

**Note:** The required Java version and supported Minecraft versions depend on the plugin's build configuration.

### Installing

1. Download the latest release of Lubru-RPGPlugin.
2. Stop your Minecraft server.
3. Place the plugin `.jar` file into your server's `plugins` folder.
4. Start or restart your server.
5. Check the server console to make sure the plugin loaded successfully.

### Executing the Plugin

1. Join your Minecraft server.
2. Open the chat.
3. Execute the following command:

```text
/rpg
```

4. Explore the available RPG features and start earning XP by defeating zombies and skeletons.
5. Level up your character and develop your RPG stats.

## Commands

| Command | Description |
|---|---|
| `/rpg` | Access the RPG system |

## Help

If you encounter any issues:

- Make sure the plugin `.jar` file is in the correct `plugins` folder.
- Verify that your Minecraft server version is compatible.
- Check the server console for errors during startup.
- Make sure Java is correctly installed and configured.

If the plugin does not work as expected, report the issue with your Minecraft version, server software, and relevant console logs.

## Pictures
<img width="451" height="250" alt="image" src="https://github.com/user-attachments/assets/bef75db1-5d5d-4420-93d5-51dc42a00418" />
<img width="733" height="116" alt="image" src="https://github.com/user-attachments/assets/d20d1f98-3b7f-44cb-9117-287243cad4ab" />

## Tech Stack

- **Language:** Java
- **Minecraft Version:** 26.3
- **Server Software / Platform:** Paper
- **Plugin Type:** Bukkit-compatible server plugin
- **Build System:** Gradle
- **Loader:** Paper Plugin Loader (no client-side mod loader required)
- **Target Environment:** Minecraft Java Edition dedicated servers

> **Note:** This is a server-side plugin. Players do not need to install a client-side mod to use its features.

## License

This project is distributed under the license of free to use
