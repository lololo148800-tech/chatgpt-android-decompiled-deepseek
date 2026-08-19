package ao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: renamed from: ao.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C11158d extends AbstractC11186r {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f33795b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11138L f33796c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11158d(KSerializer eSerializer, int i10) {
        super(eSerializer);
        this.f33795b = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(eSerializer, "eSerializer");
                super(eSerializer);
                SerialDescriptor elementDesc = eSerializer.getDescriptor();
                AbstractC16544l.m18094g(elementDesc, "elementDesc");
                this.f33796c = new C11156c(elementDesc, 2);
                break;
            case 2:
                AbstractC16544l.m18094g(eSerializer, "eSerializer");
                super(eSerializer);
                SerialDescriptor elementDesc2 = eSerializer.getDescriptor();
                AbstractC16544l.m18094g(elementDesc2, "elementDesc");
                this.f33796c = new C11156c(elementDesc2, 3);
                break;
            default:
                AbstractC16544l.m18094g(eSerializer, "element");
                SerialDescriptor elementDesc3 = eSerializer.getDescriptor();
                AbstractC16544l.m18094g(elementDesc3, "elementDesc");
                this.f33796c = new C11156c(elementDesc3, 1);
                break;
        }
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: a */
    public final Object mo12366a() {
        switch (this.f33795b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: b */
    public final int mo12367b(Object obj) {
        switch (this.f33795b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC16544l.m18094g(arrayList, "<this>");
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC16544l.m18094g(hashSet, "<this>");
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC16544l.m18094g(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: c */
    public final Iterator mo12368c(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC16544l.m18094g(collection, "<this>");
        return collection.iterator();
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        Collection collection = (Collection) obj;
        AbstractC16544l.m18094g(collection, "<this>");
        return collection.size();
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        switch (this.f33795b) {
            case 0:
                AbstractC16544l.m18094g(null, "<this>");
                return new ArrayList((Collection) null);
            case 1:
                AbstractC16544l.m18094g(null, "<this>");
                return new HashSet((Collection) null);
            default:
                AbstractC16544l.m18094g(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f33795b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (C11156c) this.f33796c;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: h */
    public final Object mo12369h(Object obj) {
        switch (this.f33795b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC16544l.m18094g(arrayList, "<this>");
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC16544l.m18094g(hashSet, "<this>");
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC16544l.m18094g(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // ao.AbstractC11186r
    /* JADX INFO: renamed from: i */
    public final void mo12392i(Object obj, int i10, Object obj2) {
        switch (this.f33795b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                AbstractC16544l.m18094g(arrayList, "<this>");
                arrayList.add(i10, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                AbstractC16544l.m18094g(hashSet, "<this>");
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                AbstractC16544l.m18094g(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
