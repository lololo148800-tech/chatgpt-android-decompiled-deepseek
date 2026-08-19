package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import p049Bm.InterfaceC1436k;
import p077Cn.C1756x;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(Collection<? extends H> collection, InterfaceC1436k descriptorByHandle) {
        AbstractC16544l.m18094g(collection, "<this>");
        AbstractC16544l.m18094g(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetCreate = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object objM19341Q = AbstractC17680n.m19341Q(linkedList);
            SmartSet smartSetCreate2 = SmartSet.Companion.create();
            Collection collectionExtractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(objM19341Q, linkedList, descriptorByHandle, new C1756x(smartSetCreate2, 20));
            AbstractC16544l.m18093f(collectionExtractMembersOverridableInBothWays, "extractMembersOverridableInBothWays(...)");
            if (collectionExtractMembersOverridableInBothWays.size() == 1 && smartSetCreate2.isEmpty()) {
                Object objM19364n0 = AbstractC17680n.m19364n0(collectionExtractMembersOverridableInBothWays);
                AbstractC16544l.m18093f(objM19364n0, "single(...)");
                smartSetCreate.add(objM19364n0);
            } else {
                Object objSelectMostSpecificMember = OverridingUtil.selectMostSpecificMember(collectionExtractMembersOverridableInBothWays, descriptorByHandle);
                CallableDescriptor callableDescriptor = (CallableDescriptor) descriptorByHandle.invoke(objSelectMostSpecificMember);
                for (Object obj : collectionExtractMembersOverridableInBothWays) {
                    AbstractC16544l.m18091d(obj);
                    if (!OverridingUtil.isMoreSpecific(callableDescriptor, (CallableDescriptor) descriptorByHandle.invoke(obj))) {
                        smartSetCreate2.add(obj);
                    }
                }
                if (!smartSetCreate2.isEmpty()) {
                    smartSetCreate.addAll(smartSetCreate2);
                }
                smartSetCreate.add(objSelectMostSpecificMember);
            }
        }
        return smartSetCreate;
    }
}
