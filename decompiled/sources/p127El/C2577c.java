package p127El;

import java.util.LinkedHashSet;
import livekit.org.webrtc.CameraXCapturerKt;
import p103Dn.InterfaceC2149O0;
import p1160zp.AbstractC22225a;
import p387Pl.C6501u;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p867l8.C16831c;

/* JADX INFO: renamed from: El.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2577c {
    public static final C2576b Companion = new C2576b();

    /* JADX INFO: renamed from: a */
    public final InterfaceC2149O0 f8011a;

    /* JADX INFO: renamed from: b */
    public Float f8012b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f8013c;

    public C2577c(C6501u c6501u) {
        InterfaceC2149O0 cameraX = CameraXCapturerKt.getCameraX(c6501u.f21089n);
        this.f8011a = cameraX;
        if (cameraX != null) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26118o0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18569g(new Object[0]);
            }
        }
        this.f8013c = new LinkedHashSet();
    }
}
