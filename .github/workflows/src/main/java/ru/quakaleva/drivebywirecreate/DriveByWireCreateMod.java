package ru.quakaleva.drivebywirecreate;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import ru.quakaleva.drivebywirecreate.compat.CreateCompat;

@Mod("drivebywire_create")
public class DriveByWireCreateMod {

    public DriveByWireCreateMod() {
        FMLJavaModLoadingContext.get()
            .getModEventBus()
            .addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(CreateCompat::init);
    }
}
