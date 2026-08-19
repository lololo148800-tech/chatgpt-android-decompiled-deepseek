package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.E */
/* JADX INFO: loaded from: classes.dex */
public final class C10926E extends AbstractC10927F {
    @Override // androidx.datastore.preferences.protobuf.AbstractC10927F
    /* JADX INFO: renamed from: a */
    public final void mo11435a(long j10, Object obj) {
        ((AbstractC10949b) ((InterfaceC10991w) AbstractC10982r0.f33089d.m11687i(j10, obj))).f33013Y = false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10927F
    /* JADX INFO: renamed from: b */
    public final void mo11436b(AbstractC10987u abstractC10987u, AbstractC10987u abstractC10987u2, long j10) {
        AbstractC10980q0 abstractC10980q0 = AbstractC10982r0.f33089d;
        InterfaceC10991w interfaceC10991wMo11431b = (InterfaceC10991w) abstractC10980q0.m11687i(j10, abstractC10987u);
        InterfaceC10991w interfaceC10991w = (InterfaceC10991w) abstractC10980q0.m11687i(j10, abstractC10987u2);
        int size = interfaceC10991wMo11431b.size();
        int size2 = interfaceC10991w.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC10949b) interfaceC10991wMo11431b).f33013Y) {
                interfaceC10991wMo11431b = interfaceC10991wMo11431b.mo11431b(size2 + size);
            }
            interfaceC10991wMo11431b.addAll(interfaceC10991w);
        }
        if (size > 0) {
            interfaceC10991w = interfaceC10991wMo11431b;
        }
        AbstractC10982r0.m11709r(j10, abstractC10987u, interfaceC10991w);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10927F
    /* JADX INFO: renamed from: c */
    public final List mo11437c(long j10, Object obj) {
        InterfaceC10991w interfaceC10991w = (InterfaceC10991w) AbstractC10982r0.f33089d.m11687i(j10, obj);
        if (((AbstractC10949b) interfaceC10991w).f33013Y) {
            return interfaceC10991w;
        }
        int size = interfaceC10991w.size();
        InterfaceC10991w interfaceC10991wMo11431b = interfaceC10991w.mo11431b(size == 0 ? 10 : size * 2);
        AbstractC10982r0.m11709r(j10, obj, interfaceC10991wMo11431b);
        return interfaceC10991wMo11431b;
    }
}
