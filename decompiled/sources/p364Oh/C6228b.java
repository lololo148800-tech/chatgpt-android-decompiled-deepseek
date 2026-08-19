package p364Oh;

import p195Hh.C3430e;
import p499U9.C7591u;
import p523V9.AbstractC8168p6;
import p556Wk.C8915b0;

/* JADX INFO: renamed from: Oh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6228b extends Exception {

    /* JADX INFO: renamed from: q0 */
    public static final C7591u f20281q0 = new C7591u(13);

    /* JADX INFO: renamed from: r0 */
    public static final C3430e f20282r0 = AbstractC8168p6.m8749b("NetworkResult", null);

    /* JADX INFO: renamed from: Y */
    public final String f20283Y;

    /* JADX INFO: renamed from: Z */
    public final String f20284Z;

    /* JADX INFO: renamed from: o0 */
    public final Integer f20285o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f20286p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6228b(C8915b0 c8915b0, String str, String str2, Integer num, boolean z6, int i10) {
        super(c8915b0);
        num = (i10 & 8) != 0 ? null : num;
        z6 = (i10 & 16) != 0 ? false : z6;
        this.f20283Y = str;
        this.f20284Z = str2;
        this.f20285o0 = num;
        this.f20286p0 = z6;
    }
}
