package p401Qb;

import p1060v9.AbstractC20502t;

/* JADX INFO: renamed from: Qb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6584a extends Exception {

    /* JADX INFO: renamed from: Y */
    public final int f21271Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6584a(String str, int i10) {
        super(str);
        AbstractC20502t.m21154e(str, "Provided message must not be empty.");
        this.f21271Y = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6584a(int i10, Exception exc, String str) {
        super(str, exc);
        AbstractC20502t.m21154e(str, "Provided message must not be empty.");
        this.f21271Y = i10;
    }
}
