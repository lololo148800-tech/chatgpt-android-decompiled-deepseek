package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ao.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C11160e extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public boolean[] f33798a;

    /* JADX INFO: renamed from: b */
    public int f33799b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f33798a, this.f33799b);
        AbstractC16544l.m18093f(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        boolean[] zArr = this.f33798a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
            AbstractC16544l.m18093f(zArrCopyOf, "copyOf(...)");
            this.f33798a = zArrCopyOf;
        }
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33799b;
    }
}
