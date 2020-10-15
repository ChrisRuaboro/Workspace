/*
 * A module, not only can export some of its packages. It must
 * requires other modules, in order to use those modules' exported packages
 */
module com.entertainment.test
{
    // I am not going to export any of my packages.
    // I am the "client" module - no other module uses the classes in my packages

    // BUT i *must* "requires" the modules that i want access too
    requires com.entertainment;
}