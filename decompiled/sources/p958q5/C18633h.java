package p958q5;

import android.webkit.MimeTypeMap;
import java.io.File;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p1061vb.C20513d;
import p1112xm.AbstractC21304h;
import p899n5.C17496m;
import p899n5.EnumC17488e;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: q5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C18633h implements InterfaceC18632g {

    /* JADX INFO: renamed from: a */
    public final File f59356a;

    public C18633h(File file) {
        this.f59356a = file;
    }

    @Override // p958q5.InterfaceC18632g
    /* JADX INFO: renamed from: a */
    public final Object mo19985a(InterfaceC18770c interfaceC18770c) {
        String str = C0654C.f1910Z;
        File file = this.f59356a;
        return new C18638m(new C17496m(C20513d.m21170o(file), AbstractC0682p.f1991a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(AbstractC21304h.m21642e(file)), EnumC17488e.f55953o0);
    }
}
