package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ao.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C11178n extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public char[] f33822a;

    /* JADX INFO: renamed from: b */
    public int f33823b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f33822a, this.f33823b);
        AbstractC16544l.m18093f(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        char[] cArr = this.f33822a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            AbstractC16544l.m18093f(cArrCopyOf, "copyOf(...)");
            this.f33822a = cArrCopyOf;
        }
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33823b;
    }
}
