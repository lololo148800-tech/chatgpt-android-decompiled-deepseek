package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.D */
/* JADX INFO: loaded from: classes.dex */
public final class C11008D {
    /* JADX INFO: renamed from: a */
    public static void m11849a(long j10, Object obj) {
        AbstractC11032b abstractC11032b = (AbstractC11032b) ((InterfaceC11062x) AbstractC11041f0.f33295c.m11996h(j10, obj));
        if (abstractC11032b.f33285Y) {
            abstractC11032b.f33285Y = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC11062x m11850b(long j10, Object obj) {
        InterfaceC11062x interfaceC11062x = (InterfaceC11062x) AbstractC11041f0.f33295c.m11996h(j10, obj);
        if (((AbstractC11032b) interfaceC11062x).f33285Y) {
            return interfaceC11062x;
        }
        int size = interfaceC11062x.size();
        C11024U c11024uM11921j = ((C11024U) interfaceC11062x).m11921j(size == 0 ? 10 : size * 2);
        AbstractC11041f0.m12018o(j10, obj, c11024uM11921j);
        return c11024uM11921j;
    }
}
