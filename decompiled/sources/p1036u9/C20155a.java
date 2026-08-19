package p1036u9;

import java.util.Arrays;
import p1022t9.InterfaceC19817b;
import p1060v9.AbstractC20502t;
import p658b5.C11232c;

/* JADX INFO: renamed from: u9.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20155a {

    /* JADX INFO: renamed from: a */
    public final int f63843a;

    /* JADX INFO: renamed from: b */
    public final C11232c f63844b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC19817b f63845c;

    /* JADX INFO: renamed from: d */
    public final String f63846d;

    public C20155a(C11232c c11232c, InterfaceC19817b interfaceC19817b, String str) {
        this.f63844b = c11232c;
        this.f63845c = interfaceC19817b;
        this.f63846d = str;
        this.f63843a = Arrays.hashCode(new Object[]{c11232c, interfaceC19817b, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20155a)) {
            return false;
        }
        C20155a c20155a = (C20155a) obj;
        return AbstractC20502t.m21161l(this.f63844b, c20155a.f63844b) && AbstractC20502t.m21161l(this.f63845c, c20155a.f63845c) && AbstractC20502t.m21161l(this.f63846d, c20155a.f63846d);
    }

    public final int hashCode() {
        return this.f63843a;
    }
}
