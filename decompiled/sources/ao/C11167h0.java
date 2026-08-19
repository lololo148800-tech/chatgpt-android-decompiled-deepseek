package ao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8138m0;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: ao.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11167h0 extends AbstractC11186r {

    /* JADX INFO: renamed from: b */
    public final InterfaceC3756d f33809b;

    /* JADX INFO: renamed from: c */
    public final C11156c f33810c;

    public C11167h0(InterfaceC3756d interfaceC3756d, KSerializer kSerializer) {
        super(kSerializer);
        this.f33809b = interfaceC3756d;
        SerialDescriptor elementDesc = kSerializer.getDescriptor();
        AbstractC16544l.m18094g(elementDesc, "elementDesc");
        this.f33810c = new C11156c(elementDesc, 0);
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: a */
    public final Object mo12366a() {
        return new ArrayList();
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: b */
    public final int mo12367b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC16544l.m18094g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: c */
    public final Iterator mo12368c(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC16544l.m18094g(objArr, "<this>");
        return AbstractC16544l.m18098k(objArr);
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        Object[] objArr = (Object[]) obj;
        AbstractC16544l.m18094g(objArr, "<this>");
        return objArr.length;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        AbstractC16544l.m18094g(null, "<this>");
        AbstractC17678l.m19296c(null);
        throw null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f33810c;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: h */
    public final Object mo12369h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC16544l.m18094g(arrayList, "<this>");
        InterfaceC3756d eClass = this.f33809b;
        AbstractC16544l.m18094g(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC8138m0.m8667b(eClass), arrayList.size());
        AbstractC16544l.m18092e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        AbstractC16544l.m18093f(array, "toArray(...)");
        return array;
    }

    @Override // ao.AbstractC11186r
    /* JADX INFO: renamed from: i */
    public final void mo12392i(Object obj, int i10, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        AbstractC16544l.m18094g(arrayList, "<this>");
        arrayList.add(i10, obj2);
    }
}
