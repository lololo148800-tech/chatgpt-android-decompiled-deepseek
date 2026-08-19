package p1071w0;

import kotlin.jvm.internal.AbstractC16544l;
import p1036u9.C20168n;
import p350O1.C6045C;

/* JADX INFO: renamed from: w0.N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20724N0 {

    /* JADX INFO: renamed from: a */
    public final int f65705a = 100000;

    /* JADX INFO: renamed from: b */
    public C20168n f65706b;

    /* JADX INFO: renamed from: c */
    public C20168n f65707c;

    /* JADX INFO: renamed from: d */
    public int f65708d;

    /* JADX INFO: renamed from: e */
    public Long f65709e;

    /* JADX INFO: renamed from: f */
    public boolean f65710f;

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX INFO: renamed from: a */
    public final void m21222a(C6045C c6045c) {
        C20168n c20168n;
        C6045C c6045c2;
        this.f65710f = false;
        C20168n c20168n2 = this.f65706b;
        if (AbstractC16544l.m18089b(c6045c, c20168n2 != null ? (C6045C) c20168n2.f63876o0 : null)) {
            return;
        }
        String str = c6045c.f19682a.f10934Y;
        C20168n c20168n3 = this.f65706b;
        if (AbstractC16544l.m18089b(str, (c20168n3 == null || (c6045c2 = (C6045C) c20168n3.f63876o0) == null) ? null : c6045c2.f19682a.f10934Y)) {
            C20168n c20168n4 = this.f65706b;
            if (c20168n4 == null) {
                return;
            }
            c20168n4.f63876o0 = c6045c;
            return;
        }
        this.f65706b = new C20168n(this.f65706b, 2, c6045c);
        this.f65707c = null;
        int length = c6045c.f19682a.f10934Y.length() + this.f65708d;
        this.f65708d = length;
        if (length > this.f65705a) {
            C20168n c20168n5 = this.f65706b;
            if ((c20168n5 != null ? (C20168n) c20168n5.f63875Z : null) == null) {
                return;
            }
            while (true) {
                if (c20168n5 == null) {
                    c20168n = null;
                } else {
                    C20168n c20168n6 = (C20168n) c20168n5.f63875Z;
                    if (c20168n6 != null) {
                        c20168n = (C20168n) c20168n6.f63875Z;
                    } else {
                        c20168n = null;
                    }
                }
                if (c20168n == null) {
                    break;
                } else {
                    c20168n5 = (C20168n) c20168n5.f63875Z;
                }
            }
            if (c20168n5 == null) {
                return;
            }
            c20168n5.f63875Z = null;
        }
    }
}
