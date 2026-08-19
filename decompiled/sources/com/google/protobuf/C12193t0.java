package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: com.google.protobuf.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12193t0 extends AbstractC12199v0 {

    /* JADX INFO: renamed from: c */
    public static final Class f37106c = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: renamed from: d */
    public static List m14124d(long j10, Object obj, int i10) {
        List list;
        List listMo13855b;
        List list2 = (List) AbstractC12209y1.f37124c.m14173k(j10, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC12190s0) {
                listMo13855b = new C12187r0(i10);
            } else {
                listMo13855b = ((list2 instanceof InterfaceC12126V0) && (list2 instanceof InterfaceC12172m0)) ? ((InterfaceC12172m0) list2).mo13855b(i10) : new ArrayList(i10);
            }
            AbstractC12209y1.m14199v(j10, obj, listMo13855b);
            return listMo13855b;
        }
        if (f37106c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i10);
            arrayList.addAll(list2);
            AbstractC12209y1.m14199v(j10, obj, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof C12194t1)) {
                if (!(list2 instanceof InterfaceC12126V0) || !(list2 instanceof InterfaceC12172m0)) {
                    return list2;
                }
                InterfaceC12172m0 interfaceC12172m0 = (InterfaceC12172m0) list2;
                if (((AbstractC12141c) interfaceC12172m0).f37021Y) {
                    return list2;
                }
                InterfaceC12172m0 interfaceC12172m0Mo13855b = interfaceC12172m0.mo13855b(list2.size() + i10);
                AbstractC12209y1.m14199v(j10, obj, interfaceC12172m0Mo13855b);
                return interfaceC12172m0Mo13855b;
            }
            C12187r0 c12187r0 = new C12187r0(list2.size() + i10);
            c12187r0.addAll((C12194t1) list2);
            AbstractC12209y1.m14199v(j10, obj, c12187r0);
            list = c12187r0;
        }
        return list;
    }

    @Override // com.google.protobuf.AbstractC12199v0
    /* JADX INFO: renamed from: a */
    public final void mo14125a(long j10, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC12209y1.f37124c.m14173k(j10, obj);
        if (list instanceof InterfaceC12190s0) {
            objUnmodifiableList = ((InterfaceC12190s0) list).getUnmodifiableView();
        } else {
            if (f37106c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC12126V0) && (list instanceof InterfaceC12172m0)) {
                AbstractC12141c abstractC12141c = (AbstractC12141c) ((InterfaceC12172m0) list);
                if (abstractC12141c.f37021Y) {
                    abstractC12141c.f37021Y = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        AbstractC12209y1.m14199v(j10, obj, objUnmodifiableList);
    }

    @Override // com.google.protobuf.AbstractC12199v0
    /* JADX INFO: renamed from: b */
    public final void mo14126b(long j10, Object obj, Object obj2) {
        List list = (List) AbstractC12209y1.f37124c.m14173k(j10, obj2);
        List listM14124d = m14124d(j10, obj, list.size());
        int size = listM14124d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM14124d.addAll(list);
        }
        if (size > 0) {
            list = listM14124d;
        }
        AbstractC12209y1.m14199v(j10, obj, list);
    }

    @Override // com.google.protobuf.AbstractC12199v0
    /* JADX INFO: renamed from: c */
    public final List mo14127c(long j10, Object obj) {
        return m14124d(j10, obj, 10);
    }
}
