package mp;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p879lp.EnumC17120c;
import p879lp.InterfaceC17121d;

/* JADX INFO: renamed from: mp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C17360a implements InterfaceC17121d {

    /* JADX INFO: renamed from: a */
    public final EnumC17120c f55388a;

    /* JADX INFO: renamed from: b */
    public final int f55389b;

    /* JADX INFO: renamed from: c */
    public final int f55390c;

    public C17360a(EnumC17120c enumC17120c, int i10, int i11) {
        this.f55388a = enumC17120c;
        this.f55389b = i10;
        this.f55390c = i11;
    }

    @Override // p879lp.InterfaceC17121d
    public final int getBeginIndex() {
        return this.f55389b;
    }

    @Override // p879lp.InterfaceC17121d
    public final int getEndIndex() {
        return this.f55390c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Link{type=");
        sb2.append(this.f55388a);
        sb2.append(", beginIndex=");
        sb2.append(this.f55389b);
        sb2.append(", endIndex=");
        return AbstractC10763a.m11056n(sb2, this.f55390c, "}");
    }
}
