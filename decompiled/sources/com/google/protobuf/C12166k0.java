package com.google.protobuf;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12166k0 extends AbstractList {

    /* JADX INFO: renamed from: Y */
    public final List f37044Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC12163j0 f37045Z;

    public C12166k0(List list, InterfaceC12163j0 interfaceC12163j0) {
        this.f37044Y = list;
        this.f37045Z = interfaceC12163j0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.f37045Z.mo7515a(this.f37044Y.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37044Y.size();
    }
}
