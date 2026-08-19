package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ao.M */
/* JADX INFO: loaded from: classes2.dex */
public final class C11139M extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public long[] f33770a;

    /* JADX INFO: renamed from: b */
    public int f33771b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f33770a, this.f33771b);
        AbstractC16544l.m18093f(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        long[] jArr = this.f33770a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            AbstractC16544l.m18093f(jArrCopyOf, "copyOf(...)");
            this.f33770a = jArrCopyOf;
        }
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33771b;
    }
}
