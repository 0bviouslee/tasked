package vb.$tasked;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	public static Object GLOBAL_a8cbab38744461f83dacb15f3fd57135;
	public static java.util.regex.Pattern HEX_PATTERN = java.util.regex.Pattern
			.compile("#([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])([A-Fa-f0-9])");

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
		saveDefaultConfig();
		PluginMain.createResourceFile("tasks.yml");
		try {
			PluginMain.GLOBAL_a8cbab38744461f83dacb15f3fd57135 = org.bukkit.configuration.file.YamlConfiguration
					.loadConfiguration(new File(String.valueOf(PluginMain.getInstance().getDataFolder()), "tasks.yml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
			PluginMain.registerPlaceholders();
		}
	}

	@Override
	public void onDisable() {
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("tasked")) {
			Object $8e504179207c1b72d96af4e23fcad242 = null;
			Object $e6f5eb9f16d8fab02f4ebf2bcdfdd4e8 = null;
			Object $612c3fccc69f413d7385bbd9ba0553d3 = null;
			Object $955500749a08686f820d53163596705a = null;
			Object $cb28c0b8627425a305b945fffe022e0e = null;
			Object $ab0c38b336642cc20efabe80c8dac336 = null;
			try {
				if (((((double) ((int) PluginMain.createList(commandArgs).size())) > (0d))
						&& ((boolean) ((org.bukkit.permissions.Permissible) (Object) commandSender)
								.hasPermission(("tasked."
										+ (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)))))) {
					if ((((boolean) (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)
							.startsWith("rel"))
							|| ((boolean) (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)
									.startsWith("rl")))) {
						PluginMain.getInstance().reloadConfig();
						commandSender.sendMessage(String.valueOf(PluginMain.function("pluginMessagePrefix",
								new ArrayList(Arrays.asList(commandSender, "plugin-reload")))));
					} else if (((boolean) (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)
							.startsWith("l"))) {
						if (PluginMain.checkEquals(
								((java.lang.Object) (Object) ((int) PluginMain.createList(commandArgs).size())),
								((java.lang.Object) (Object) (2d)))) {
							commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', PluginMain.HEX_PATTERN
									.matcher(me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
											((org.bukkit.OfflinePlayer) (Object) commandSender),
											(((((java.lang.String) String
													.valueOf(PluginMain.getInstance().getConfig().get("task-list"))
													.replaceAll("%player%",
															(commandArgs.length > ((int) (1d))
																	? commandArgs[((int) (1d))]
																	: null)))
													+ String.valueOf('\n')) + "")
													+ ((java.lang.String) ((java.lang.String) ((java.lang.String) ((java.lang.String) String
															.valueOf(
																	((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
																			.get((commandArgs.length > ((int) (1d))
																					? commandArgs[((int) (1d))]
																					: null)))
															.replaceAll("\\]", "")).replaceAll("\\[", ""))
																	.replaceAll(", ", String.valueOf('\n'))).replace(
																			String.valueOf("null"),
																			String.valueOf("None"))))))
									.replaceAll("&x&$1&$2&$3&$4&$5&$6")));
						} else {
							commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', PluginMain.HEX_PATTERN
									.matcher(me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
											((org.bukkit.OfflinePlayer) (Object) commandSender),
											(((((java.lang.String) String
													.valueOf(PluginMain.getInstance().getConfig().get("task-list"))
													.replaceAll("%player%",
															((java.lang.String) commandSender.getName())))
													+ String.valueOf('\n')) + "")
													+ ((java.lang.String) ((java.lang.String) ((java.lang.String) ((java.lang.String) String
															.valueOf(
																	((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
																			.get(((java.lang.String) commandSender
																					.getName())))
															.replaceAll("\\]", "")).replaceAll("\\[", ""))
																	.replaceAll(", ", String.valueOf('\n'))).replace(
																			String.valueOf("null"),
																			String.valueOf("None"))))))
									.replaceAll("&x&$1&$2&$3&$4&$5&$6")));
						}
					} else if (((boolean) (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)
							.startsWith("a"))) {
						if ((((double) ((int) PluginMain.createList(commandArgs).size())) >= (3d))) {
							$8e504179207c1b72d96af4e23fcad242 = PluginMain.createList(commandArgs);
							((java.util.List) (Object) $8e504179207c1b72d96af4e23fcad242)
									.remove((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null));
							((java.util.List) (Object) $8e504179207c1b72d96af4e23fcad242)
									.remove((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null));
							$cb28c0b8627425a305b945fffe022e0e = ((java.lang.String) ((java.lang.String) ((java.lang.String) String
									.valueOf($8e504179207c1b72d96af4e23fcad242).replaceAll("\\]", "")).replaceAll("\\[",
											"")).replaceAll(",", ""));
							if (((PluginMain.checkEquals(
									((java.lang.Object) (Object) (((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
											.get((commandArgs.length > ((int) (1d))
													? commandArgs[((int) (1d))]
													: null)) == null)),
									((java.lang.Object) (Object) true))
									|| PluginMain.checkEquals(
											((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
													.get((commandArgs.length > ((int) (1d))
															? commandArgs[((int) (1d))]
															: null)),
											""))
									|| PluginMain.checkEquals(
											((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
													.get((commandArgs.length > ((int) (1d))
															? commandArgs[((int) (1d))]
															: null)),
											"[]"))) {
								((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
										.set((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null),
												new ArrayList(Arrays.asList($cb28c0b8627425a305b945fffe022e0e)));
							} else {
								((java.util.List) (Object) ((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
										.get((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null)))
												.add($cb28c0b8627425a305b945fffe022e0e);
							}
							((org.bukkit.configuration.file.FileConfiguration) ((org.bukkit.configuration.file.FileConfiguration) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135))
									.save(new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
											"tasks.yml"));
							commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&', PluginMain.HEX_PATTERN
									.matcher(me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
											((org.bukkit.OfflinePlayer) (Object) commandSender),
											(String.valueOf(PluginMain.getInstance().getConfig().get("prefix"))
													+ ((java.lang.String) ((java.lang.String) String
															.valueOf(PluginMain.getInstance().getConfig()
																	.get("task-added"))
															.replaceAll("%task%",
																	String.valueOf($cb28c0b8627425a305b945fffe022e0e)))
																			.replaceAll("%player%",
																					(commandArgs.length > ((int) (1d))
																							? commandArgs[((int) (1d))]
																							: null))))))
									.replaceAll("&x&$1&$2&$3&$4&$5&$6")));
							if (PluginMain.checkEquals(PluginMain.getInstance().getConfig().get("discord-integration"),
									((java.lang.Object) (Object) true))) {
								$612c3fccc69f413d7385bbd9ba0553d3 = PluginMain.function("discordWebhook",
										((java.util.List) null));
								$955500749a08686f820d53163596705a = new ru.sal4i.sdiscordwebhook.EmbedObject(
										String.valueOf(
												PluginMain.getInstance().getConfig().get("task-created-webhook.title")),
										((java.lang.String) null), ((java.lang.String) null),
										((ru.sal4i.sdiscordwebhook.EmbedColor) (Object) PluginMain.function(
												"HEX Translation", new ArrayList(Arrays.asList(PluginMain.getInstance()
														.getConfig().get("task-created-webhook.color"))))));
								((ru.sal4i.sdiscordwebhook.SDiscordWebhook) (Object) $612c3fccc69f413d7385bbd9ba0553d3)
										.addEmbed(
												((ru.sal4i.sdiscordwebhook.EmbedObject) (Object) $955500749a08686f820d53163596705a));
								((ru.sal4i.sdiscordwebhook.EmbedObject) (Object) $955500749a08686f820d53163596705a)
										.addField(
												String.valueOf(PluginMain.getInstance().getConfig()
														.get("task-created-webhook.tasks-field")),
												((java.lang.String) ((java.lang.String) String.valueOf(
														((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
																.get((commandArgs.length > ((int) (1d))
																		? commandArgs[((int) (1d))]
																		: null)))
														.replaceAll("\\]", "")).replaceAll("\\[", "")),
												false);
								((ru.sal4i.sdiscordwebhook.EmbedObject) (Object) $955500749a08686f820d53163596705a)
										.addField(
												String.valueOf(PluginMain.getInstance().getConfig()
														.get("task-created-webhook.assigned-to-field")),
												(commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null),
												true);
								((ru.sal4i.sdiscordwebhook.EmbedObject) (Object) $955500749a08686f820d53163596705a)
										.addField(
												String.valueOf(PluginMain.getInstance().getConfig()
														.get("task-created-webhook.assigned-by-field")),
												((java.lang.String) commandSender.getName()), true);
								((ru.sal4i.sdiscordwebhook.SDiscordWebhook) (Object) $612c3fccc69f413d7385bbd9ba0553d3)
										.execute();
							}
						} else {
							commandSender.sendMessage(String.valueOf(PluginMain.function("pluginMessagePrefix",
									new ArrayList(Arrays.asList(commandSender, "invalid-usage")))));
						}
					} else if (((boolean) (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)
							.startsWith("r"))) {
						if ((((double) ((int) PluginMain.createList(commandArgs).size())) >= (3d))) {
							$8e504179207c1b72d96af4e23fcad242 = PluginMain.createList(commandArgs);
							((java.util.List) (Object) $8e504179207c1b72d96af4e23fcad242)
									.remove((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null));
							((java.util.List) (Object) $8e504179207c1b72d96af4e23fcad242)
									.remove((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null));
							$cb28c0b8627425a305b945fffe022e0e = ((java.lang.String) ((java.lang.String) ((java.lang.String) String
									.valueOf($8e504179207c1b72d96af4e23fcad242).replaceAll("\\]", "")).replaceAll("\\[",
											"")).replaceAll(",", ""));
							if (((boolean) ((java.util.List) (Object) ((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
									.get((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null)))
											.contains($cb28c0b8627425a305b945fffe022e0e))) {
								((java.util.List) (Object) ((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
										.get((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null)))
												.remove($cb28c0b8627425a305b945fffe022e0e);
								((org.bukkit.configuration.file.FileConfiguration) ((org.bukkit.configuration.file.FileConfiguration) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135))
										.save(new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
												"tasks.yml"));
								if (PluginMain.checkEquals(
										((java.lang.Object) (Object) ((int) ((java.util.List) (Object) ((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
												.get((commandArgs.length > ((int) (1d))
														? commandArgs[((int) (1d))]
														: null))).size())),
										((java.lang.Object) (Object) (0d)))) {
									((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
											.set((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null),
													((java.lang.Object) null));
									((org.bukkit.configuration.file.FileConfiguration) ((org.bukkit.configuration.file.FileConfiguration) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135))
											.save(new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
													"tasks.yml"));
								}
								commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
										PluginMain.HEX_PATTERN
												.matcher(me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
														((org.bukkit.OfflinePlayer) (Object) commandSender),
														(String.valueOf(
																PluginMain.getInstance().getConfig().get("prefix"))
																+ ((java.lang.String) ((java.lang.String) String
																		.valueOf(PluginMain.getInstance().getConfig()
																				.get("task-removed"))
																		.replaceAll("%task%", String.valueOf(
																				$cb28c0b8627425a305b945fffe022e0e)))
																						.replaceAll("%player%",
																								(commandArgs.length > ((int) (1d))
																										? commandArgs[((int) (1d))]
																										: null))))))
												.replaceAll("&x&$1&$2&$3&$4&$5&$6")));
							} else {
								commandSender.sendMessage(String.valueOf(PluginMain.function("pluginMessagePrefix",
										new ArrayList(Arrays.asList(commandSender, "unknown-task")))));
							}
						} else {
							commandSender.sendMessage(String.valueOf(PluginMain.function("pluginMessagePrefix",
									new ArrayList(Arrays.asList(commandSender, "invalid-usage")))));
						}
					} else if (((boolean) (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)
							.startsWith("c"))) {
						$8e504179207c1b72d96af4e23fcad242 = PluginMain.createList(commandArgs);
						((java.util.List) (Object) $8e504179207c1b72d96af4e23fcad242)
								.remove((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null));
						((java.util.List) (Object) $8e504179207c1b72d96af4e23fcad242)
								.remove((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null));
						$cb28c0b8627425a305b945fffe022e0e = ((java.lang.String) ((java.lang.String) ((java.lang.String) String
								.valueOf($8e504179207c1b72d96af4e23fcad242).replaceAll("\\]", "")).replaceAll("\\[",
										"")).replaceAll(",", ""));
						if ((((double) ((int) PluginMain.createList(commandArgs).size())) >= (3d))) {
							$e6f5eb9f16d8fab02f4ebf2bcdfdd4e8 = ((java.lang.String) ((java.lang.String) ((java.lang.String) String
									.valueOf($ab0c38b336642cc20efabe80c8dac336).replaceAll("\\]", "")).replaceAll("\\[",
											"")).replaceAll(",", ""));
							if (((boolean) ((java.util.List) (Object) ((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
									.get((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null)))
											.contains($cb28c0b8627425a305b945fffe022e0e))) {
								((java.util.List) (Object) ((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
										.get((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null)))
												.remove($cb28c0b8627425a305b945fffe022e0e);
								((org.bukkit.configuration.file.FileConfiguration) ((org.bukkit.configuration.file.FileConfiguration) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135))
										.save(new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
												"tasks.yml"));
								if (PluginMain.checkEquals(
										((java.lang.Object) (Object) ((int) ((java.util.List) (Object) ((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
												.get((commandArgs.length > ((int) (1d))
														? commandArgs[((int) (1d))]
														: null))).size())),
										((java.lang.Object) (Object) (0d)))) {
									((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
											.set((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null),
													((java.lang.Object) null));
									((org.bukkit.configuration.file.FileConfiguration) ((org.bukkit.configuration.file.FileConfiguration) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135))
											.save(new File(String.valueOf(PluginMain.getInstance().getDataFolder()),
													"tasks.yml"));
								}
								commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
										PluginMain.HEX_PATTERN
												.matcher(me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
														((org.bukkit.OfflinePlayer) (Object) commandSender),
														(String.valueOf(
																PluginMain.getInstance().getConfig().get("prefix"))
																+ ((java.lang.String) String
																		.valueOf(PluginMain.getInstance().getConfig()
																				.get("task-completed"))
																		.replaceAll("%task%", String.valueOf(
																				$cb28c0b8627425a305b945fffe022e0e))))))
												.replaceAll("&x&$1&$2&$3&$4&$5&$6")));
								if (PluginMain.checkEquals(
										PluginMain.getInstance().getConfig().get("discord-integration"),
										((java.lang.Object) (Object) true))) {
									$612c3fccc69f413d7385bbd9ba0553d3 = PluginMain.function("discordWebhook",
											((java.util.List) null));
									$955500749a08686f820d53163596705a = new ru.sal4i.sdiscordwebhook.EmbedObject(
											String.valueOf(PluginMain.getInstance().getConfig()
													.get("task-completed-webhook.title")),
											((java.lang.String) null), ((java.lang.String) null),
											((ru.sal4i.sdiscordwebhook.EmbedColor) (Object) PluginMain.function(
													"HEX Translation",
													new ArrayList(Arrays.asList(PluginMain.getInstance().getConfig()
															.get("task-completed-webhook.color"))))));
									((ru.sal4i.sdiscordwebhook.SDiscordWebhook) (Object) $612c3fccc69f413d7385bbd9ba0553d3)
											.addEmbed(
													((ru.sal4i.sdiscordwebhook.EmbedObject) (Object) $955500749a08686f820d53163596705a));
									((ru.sal4i.sdiscordwebhook.EmbedObject) (Object) $955500749a08686f820d53163596705a)
											.addField(
													String.valueOf(PluginMain.getInstance().getConfig()
															.get("task-completed-webhook.completed-task-field")),
													String.valueOf($cb28c0b8627425a305b945fffe022e0e), false);
									((ru.sal4i.sdiscordwebhook.EmbedObject) (Object) $955500749a08686f820d53163596705a)
											.addField(
													String.valueOf(PluginMain.getInstance().getConfig()
															.get("task-completed-webhook.completed-by-field")),
													((java.lang.String) commandSender.getName()), true);
									((ru.sal4i.sdiscordwebhook.SDiscordWebhook) (Object) $612c3fccc69f413d7385bbd9ba0553d3)
											.execute();
								}
							} else {
								commandSender.sendMessage(String.valueOf(PluginMain.function("pluginMessagePrefix",
										new ArrayList(Arrays.asList(commandSender, "unknown-task")))));
							}
						} else {
							commandSender.sendMessage(String.valueOf(PluginMain.function("pluginMessagePrefix",
									new ArrayList(Arrays.asList(commandSender, "invalid-usage")))));
						}
					} else if (((boolean) ((org.bukkit.permissions.Permissible) (Object) commandSender)
							.hasPermission("tasked.help"))) {
						commandSender.sendMessage(String.valueOf(PluginMain.function("pluginMessage",
								new ArrayList(Arrays.asList(commandSender, "help-list")))));
					}
				} else {
					commandSender.sendMessage(String.valueOf(PluginMain.function("pluginMessagePrefix",
							new ArrayList(Arrays.asList(commandSender, "no-permission")))));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		if (function.equalsIgnoreCase("discordWebhook")) {
			if (true)
				return new ru.sal4i.sdiscordwebhook.SDiscordWebhook(
						String.valueOf(PluginMain.getInstance().getConfig().get("webhook-url")),
						((java.lang.String) null),
						String.valueOf(PluginMain.getInstance().getConfig().get("webhook-name")),
						String.valueOf(PluginMain.getInstance().getConfig().get("webhook-avatar")));
		}
		if (function.equalsIgnoreCase("pluginMessage")) {
			if (true)
				return ChatColor.translateAlternateColorCodes('&',
						PluginMain.HEX_PATTERN
								.matcher(me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
										((org.bukkit.OfflinePlayer) (Object) functionArgs.get(((int) (0d)))),
										String.valueOf(PluginMain.getInstance().getConfig()
												.get(String.valueOf(functionArgs.get(((int) (1d))))))))
								.replaceAll("&x&$1&$2&$3&$4&$5&$6"));
		}
		if (function.equalsIgnoreCase("pluginMessagePrefix")) {
			if (true)
				return ChatColor.translateAlternateColorCodes('&',
						PluginMain.HEX_PATTERN
								.matcher(me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
										((org.bukkit.OfflinePlayer) (Object) functionArgs.get(((int) (0d)))),
										(String.valueOf(PluginMain.getInstance().getConfig().get("prefix"))
												+ String.valueOf(PluginMain.getInstance().getConfig()
														.get(String.valueOf(functionArgs.get(((int) (1d)))))))))
								.replaceAll("&x&$1&$2&$3&$4&$5&$6"));
		}
		if (function.equalsIgnoreCase("HEX Translation")) {
			if (true)
				return new ru.sal4i.sdiscordwebhook.EmbedColor(
						Integer.valueOf(String.valueOf(functionArgs.get(0)).substring(1, 3), 16),
						Integer.valueOf(String.valueOf(functionArgs.get(0)).substring(3, 5), 16),
						Integer.valueOf(String.valueOf(functionArgs.get(0)).substring(5, 7), 16));
		}
		return null;
	}

	public static List createList(Object obj) {
		if (obj instanceof List) {
			return (List) obj;
		}
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event1(org.bukkit.event.player.PlayerJoinEvent event) throws Exception {
		if (PluginMain.checkEquals(
				((java.lang.Object) (Object) (((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
						.get(((java.lang.String) ((org.bukkit.command.CommandSender) (Object) ((org.bukkit.entity.Player) event
								.getPlayer())).getName())) == null)),
				((java.lang.Object) (Object) false))) {
			((org.bukkit.command.CommandSender) (Object) ((org.bukkit.entity.Player) event.getPlayer()))
					.sendMessage(ChatColor.translateAlternateColorCodes('&', PluginMain.HEX_PATTERN
							.matcher(me.clip.placeholderapi.PlaceholderAPI.setPlaceholders(
									((org.bukkit.OfflinePlayer) (Object) ((org.bukkit.entity.Player) event
											.getPlayer())),
									((java.lang.String) ((java.lang.String) ((java.lang.String) ((String
											.valueOf(PluginMain.getInstance().getConfig().get("new-tasks"))
											+ String.valueOf('\n'))
											+ String.valueOf(
													((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
															.get(((java.lang.String) ((org.bukkit.command.CommandSender) (Object) ((org.bukkit.entity.Player) event
																	.getPlayer())).getName())))).replaceAll("\\]", ""))
																			.replaceAll("\\[", "")).replaceAll(", ",
																					String.valueOf('\n')))))
							.replaceAll("&x&$1&$2&$3&$4&$5&$6")));
		}
	}

	public static void registerPlaceholders() {
		PapiHook papiHook = new PapiHook();
		papiHook.registerPlaceholder("tasks", placeholderPlayer -> {
			try {
				if (true)
					return ((java.lang.String) ((java.lang.String) ((java.lang.String) ((java.lang.String) ((java.lang.String) String
							.valueOf(
									((org.bukkit.configuration.ConfigurationSection) (Object) GLOBAL_a8cbab38744461f83dacb15f3fd57135)
											.get(((java.lang.String) ((org.bukkit.command.CommandSender) (Object) placeholderPlayer)
													.getName())))
							.replaceAll("\\]", "")).replaceAll("\\[", "")).replaceAll(", ", String.valueOf('\n')))
									.replace(String.valueOf("null"), String.valueOf("None")))
											.replace(String.valueOf("null"), String.valueOf("None")));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		});
	}

	@Override
	public java.util.List<String> onTabComplete(CommandSender commandSender, Command command, String alias,
			String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("tasked")) {
			Object $5a083df607ed981af8ec7706a4d81ca3 = null;
			try {
				if ((((double) ((int) PluginMain.createList(commandArgs).size())) <= (1d))) {
					if (true)
						return ((true)
								? PluginMain.formatList(
										new ArrayList(
												Arrays.asList("help", "reload", "add", "remove", "complete", "list")),
										commandArgs)
								: new ArrayList(Arrays.asList("help", "reload", "add", "remove", "complete", "list")));
				} else if (PluginMain.checkEquals(
						((java.lang.Object) (Object) ((int) PluginMain.createList(commandArgs).size())),
						((java.lang.Object) (Object) (2d)))) {
					$5a083df607ed981af8ec7706a4d81ca3 = new ArrayList();
					for (Object FINAL_loopValue1 : PluginMain.createList(org.bukkit.Bukkit.getOnlinePlayers())) {
						((java.util.List) (Object) $5a083df607ed981af8ec7706a4d81ca3)
								.add(((java.lang.String) ((org.bukkit.command.CommandSender) (Object) FINAL_loopValue1)
										.getName()));
					}
					if (true)
						return ((false)
								? PluginMain.formatList(((java.util.List) (Object) $5a083df607ed981af8ec7706a4d81ca3),
										commandArgs)
								: ((java.util.List) (Object) $5a083df607ed981af8ec7706a4d81ca3));
				} else if ((((double) ((int) PluginMain.createList(commandArgs).size())) > (2d))) {
					if (true)
						return ((false)
								? PluginMain.formatList(new ArrayList(Arrays.asList("<task>")), commandArgs)
								: new ArrayList(Arrays.asList("<task>")));
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			return null;
		}
		return null;
	}

	public static java.util.List<String> formatList(java.util.List<String> list, String[] args) {
		java.util.List<String> completions = new java.util.ArrayList<>();
		org.bukkit.util.StringUtil.copyPartialMatches(args[args.length - 1], list, completions);
		java.util.Collections.sort(completions);
		return completions;
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
