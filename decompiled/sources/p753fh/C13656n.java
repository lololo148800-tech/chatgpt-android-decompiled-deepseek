package p753fh;

import ao.AbstractC11153a0;
import p1155zi.C22050r;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: fh.n */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13656n {
    public static final C13655m Companion = new C13655m();

    /* JADX INFO: renamed from: i */
    public static final C3430e f43121i = AbstractC8168p6.m8749b("AccountStatusResponseAccount", null);

    /* JADX INFO: renamed from: a */
    public final String f43122a;

    /* JADX INFO: renamed from: b */
    public final String f43123b;

    /* JADX INFO: renamed from: c */
    public final String f43124c;

    /* JADX INFO: renamed from: d */
    public final String f43125d;

    /* JADX INFO: renamed from: e */
    public final String f43126e;

    /* JADX INFO: renamed from: f */
    public final String f43127f;

    /* JADX INFO: renamed from: g */
    public final boolean f43128g;

    /* JADX INFO: renamed from: h */
    public final String f43129h;

    public C13656n(int i10, String str, String str2, String str3, String str4, String str5, String str6, boolean z6, String str7) {
        if (121 != (i10 & 121)) {
            AbstractC11153a0.m12389l(i10, 121, C13654l.f43120a.getDescriptor());
            throw null;
        }
        this.f43122a = str;
        if ((i10 & 2) == 0) {
            C22050r.Companion.getClass();
            this.f43123b = "default";
        } else {
            this.f43123b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f43124c = null;
        } else {
            this.f43124c = str3;
        }
        this.f43125d = str4;
        this.f43126e = str5;
        this.f43127f = str6;
        this.f43128g = z6;
        if ((i10 & 128) == 0) {
            this.f43129h = null;
        } else {
            this.f43129h = str7;
        }
    }
}
