package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ao.G */
/* JADX INFO: loaded from: classes2.dex */
public final class C11133G extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public int[] f33760a;

    /* JADX INFO: renamed from: b */
    public int f33761b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f33760a, this.f33761b);
        AbstractC16544l.m18093f(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        int[] iArr = this.f33760a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC16544l.m18093f(iArrCopyOf, "copyOf(...)");
            this.f33760a = iArrCopyOf;
        }
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33761b;
    }
}
