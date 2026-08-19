package com.google.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12196u0 extends AbstractC12199v0 {
    @Override // com.google.protobuf.AbstractC12199v0
    /* JADX INFO: renamed from: a */
    public final void mo14125a(long j10, Object obj) {
        ((AbstractC12141c) ((InterfaceC12172m0) AbstractC12209y1.f37124c.m14173k(j10, obj))).f37021Y = false;
    }

    @Override // com.google.protobuf.AbstractC12199v0
    /* JADX INFO: renamed from: b */
    public final void mo14126b(long j10, Object obj, Object obj2) {
        AbstractC12206x1 abstractC12206x1 = AbstractC12209y1.f37124c;
        InterfaceC12172m0 interfaceC12172m0Mo13855b = (InterfaceC12172m0) abstractC12206x1.m14173k(j10, obj);
        InterfaceC12172m0 interfaceC12172m0 = (InterfaceC12172m0) abstractC12206x1.m14173k(j10, obj2);
        int size = interfaceC12172m0Mo13855b.size();
        int size2 = interfaceC12172m0.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC12141c) interfaceC12172m0Mo13855b).f37021Y) {
                interfaceC12172m0Mo13855b = interfaceC12172m0Mo13855b.mo13855b(size2 + size);
            }
            interfaceC12172m0Mo13855b.addAll(interfaceC12172m0);
        }
        if (size > 0) {
            interfaceC12172m0 = interfaceC12172m0Mo13855b;
        }
        AbstractC12209y1.m14199v(j10, obj, interfaceC12172m0);
    }

    @Override // com.google.protobuf.AbstractC12199v0
    /* JADX INFO: renamed from: c */
    public final List mo14127c(long j10, Object obj) {
        InterfaceC12172m0 interfaceC12172m0 = (InterfaceC12172m0) AbstractC12209y1.f37124c.m14173k(j10, obj);
        if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
            return interfaceC12172m0;
        }
        int size = interfaceC12172m0.size();
        InterfaceC12172m0 interfaceC12172m0Mo13855b = interfaceC12172m0.mo13855b(size == 0 ? 10 : size * 2);
        AbstractC12209y1.m14199v(j10, obj, interfaceC12172m0Mo13855b);
        return interfaceC12172m0Mo13855b;
    }
}
