package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.D */
/* JADX INFO: loaded from: classes.dex */
public final class C10925D extends AbstractC10927F {

    /* JADX INFO: renamed from: c */
    public static final Class f32966c = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: renamed from: d */
    public static List m11434d(long j10, Object obj, int i10) {
        List list;
        List listMo11431b;
        List list2 = (List) AbstractC10982r0.f33089d.m11687i(j10, obj);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC10924C) {
                listMo11431b = new C10923B(i10);
            } else {
                listMo11431b = ((list2 instanceof InterfaceC10943W) && (list2 instanceof InterfaceC10991w)) ? ((InterfaceC10991w) list2).mo11431b(i10) : new ArrayList(i10);
            }
            AbstractC10982r0.m11709r(j10, obj, listMo11431b);
            return listMo11431b;
        }
        if (f32966c.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i10);
            arrayList.addAll(list2);
            AbstractC10982r0.m11709r(j10, obj, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof C10972m0)) {
                if (!(list2 instanceof InterfaceC10943W) || !(list2 instanceof InterfaceC10991w)) {
                    return list2;
                }
                InterfaceC10991w interfaceC10991w = (InterfaceC10991w) list2;
                if (((AbstractC10949b) interfaceC10991w).f33013Y) {
                    return list2;
                }
                InterfaceC10991w interfaceC10991wMo11431b = interfaceC10991w.mo11431b(list2.size() + i10);
                AbstractC10982r0.m11709r(j10, obj, interfaceC10991wMo11431b);
                return interfaceC10991wMo11431b;
            }
            C10923B c10923b = new C10923B(list2.size() + i10);
            c10923b.addAll((C10972m0) list2);
            AbstractC10982r0.m11709r(j10, obj, c10923b);
            list = c10923b;
        }
        return list;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10927F
    /* JADX INFO: renamed from: a */
    public final void mo11435a(long j10, Object obj) {
        Object objUnmodifiableList;
        List list = (List) AbstractC10982r0.f33089d.m11687i(j10, obj);
        if (list instanceof InterfaceC10924C) {
            objUnmodifiableList = ((InterfaceC10924C) list).getUnmodifiableView();
        } else {
            if (f32966c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC10943W) && (list instanceof InterfaceC10991w)) {
                AbstractC10949b abstractC10949b = (AbstractC10949b) ((InterfaceC10991w) list);
                if (abstractC10949b.f33013Y) {
                    abstractC10949b.f33013Y = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        AbstractC10982r0.m11709r(j10, obj, objUnmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10927F
    /* JADX INFO: renamed from: b */
    public final void mo11436b(AbstractC10987u abstractC10987u, AbstractC10987u abstractC10987u2, long j10) {
        List list = (List) AbstractC10982r0.f33089d.m11687i(j10, abstractC10987u2);
        List listM11434d = m11434d(j10, abstractC10987u, list.size());
        int size = listM11434d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM11434d.addAll(list);
        }
        if (size > 0) {
            list = listM11434d;
        }
        AbstractC10982r0.m11709r(j10, abstractC10987u, list);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10927F
    /* JADX INFO: renamed from: c */
    public final List mo11437c(long j10, Object obj) {
        return m11434d(j10, obj, 10);
    }
}
