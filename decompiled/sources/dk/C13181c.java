package dk;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17282c;
import p949pj.C18433F;
import p993rj.C19026F;

/* JADX INFO: renamed from: dk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13181c {

    /* JADX INFO: renamed from: a */
    public final Context f41831a;

    /* JADX INFO: renamed from: b */
    public final C18433F f41832b;

    /* JADX INFO: renamed from: c */
    public final C19026F f41833c;

    /* JADX INFO: renamed from: d */
    public final C17282c f41834d;

    public C13181c(Context context, C18433F cameraXControllerFactory, C19026F camera2ManagerFactoryFactory, C17282c navigationStateManager) {
        AbstractC16544l.m18094g(cameraXControllerFactory, "cameraXControllerFactory");
        AbstractC16544l.m18094g(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        AbstractC16544l.m18094g(navigationStateManager, "navigationStateManager");
        this.f41831a = context;
        this.f41832b = cameraXControllerFactory;
        this.f41833c = camera2ManagerFactoryFactory;
        this.f41834d = navigationStateManager;
    }
}
