package p884m3;

import android.content.Context;
import com.google.protobuf.AbstractC12107L1;
import p774h1.AbstractC14334L;

/* JADX INFO: renamed from: m3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17150i implements InterfaceC17142a {

    /* JADX INFO: renamed from: a */
    public final int f54819a;

    public C17150i(int i10) {
        this.f54819a = i10;
    }

    @Override // p884m3.InterfaceC17142a
    /* JADX INFO: renamed from: a */
    public final long mo18905a(Context context) {
        return AbstractC14334L.m15625c(C17143b.f54813a.m18906a(context, this.f54819a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17150i) && this.f54819a == ((C17150i) obj).f54819a;
    }

    public final int hashCode() {
        return this.f54819a;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("ResourceColorProvider(resId="), this.f54819a, ')');
    }
}
