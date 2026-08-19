package p884m3;

import android.content.Context;
import mm.C17321x;
import p774h1.C14365u;

/* JADX INFO: renamed from: m3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C17149h implements InterfaceC17142a {

    /* JADX INFO: renamed from: a */
    public final long f54818a;

    public C17149h(long j10) {
        this.f54818a = j10;
    }

    @Override // p884m3.InterfaceC17142a
    /* JADX INFO: renamed from: a */
    public final long mo18905a(Context context) {
        return this.f54818a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17149h) && C14365u.m15775c(this.f54818a, ((C17149h) obj).f54818a);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return C17321x.m18981a(this.f54818a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) C14365u.m15781i(this.f54818a)) + ')';
    }
}
