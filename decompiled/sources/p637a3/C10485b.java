package p637a3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p038Ba.AbstractC0865o;
import p672c3.C11628r0;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: a3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10485b extends AbstractC0865o {

    /* JADX INFO: renamed from: d */
    public final int f31066d;

    public C10485b(C11628r0 c11628r0) {
        super(c11628r0);
        this.f31066d = c11628r0.f31094a;
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo1935h(int i10, Object obj) {
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: i */
    public final void mo1936i(int i10, Object obj) {
        InterfaceC10492i interfaceC10492i = (InterfaceC10492i) obj;
        Object obj2 = this.f2433c;
        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        int i11 = ((AbstractC10494k) obj2).f31094a;
        if (i11 > 0) {
            if (interfaceC10492i instanceof AbstractC10494k) {
                AbstractC10494k abstractC10494k = (AbstractC10494k) interfaceC10492i;
                abstractC10494k.f31094a = abstractC10494k.f31095b ? this.f31066d : i11 - 1;
            }
            m10950s().add(i10, interfaceC10492i);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Too many embedded views for the current surface. The maximum depth is: ");
        Object obj3 = this.f2431a;
        AbstractC16544l.m18092e(obj3, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        sb2.append(((AbstractC10494k) obj3).f31094a);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: k */
    public final void mo1938k(int i10, int i11, int i12) {
        ArrayList arrayListM10950s = m10950s();
        int i13 = i10 > i11 ? i11 : i11 - i12;
        if (i12 != 1) {
            List listSubList = arrayListM10950s.subList(i10, i12 + i10);
            ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(listSubList);
            listSubList.clear();
            arrayListM10950s.addAll(i13, arrayListM19323D0);
            return;
        }
        if (i10 == i11 + 1 || i10 == i11 - 1) {
            arrayListM10950s.set(i10, arrayListM10950s.set(i11, arrayListM10950s.get(i10)));
        } else {
            arrayListM10950s.add(i13, arrayListM10950s.remove(i10));
        }
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: l */
    public final void mo1939l() {
        Object obj = this.f2431a;
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        ((AbstractC10494k) obj).f31096c.clear();
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: p */
    public final void mo1943p(int i10, int i11) {
        ArrayList arrayListM10950s = m10950s();
        if (i11 == 1) {
            arrayListM10950s.remove(i10);
        } else {
            arrayListM10950s.subList(i10, i11 + i10).clear();
        }
    }

    /* JADX INFO: renamed from: s */
    public final ArrayList m10950s() {
        InterfaceC10492i interfaceC10492i = (InterfaceC10492i) this.f2433c;
        if (interfaceC10492i instanceof AbstractC10494k) {
            return ((AbstractC10494k) interfaceC10492i).f31096c;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }
}
