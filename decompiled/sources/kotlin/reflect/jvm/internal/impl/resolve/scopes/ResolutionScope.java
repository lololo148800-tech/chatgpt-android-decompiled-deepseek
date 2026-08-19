package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public interface ResolutionScope {

    public static final class DefaultImpls {
        public static /* synthetic */ Collection getContributedDescriptors$default(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, InterfaceC1436k interfaceC1436k, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.ALL;
            }
            if ((i10 & 2) != 0) {
                interfaceC1436k = MemberScope.Companion.getALL_NAME_FILTER();
            }
            return resolutionScope.getContributedDescriptors(descriptorKindFilter, interfaceC1436k);
        }

        public static void recordLookup(ResolutionScope resolutionScope, Name name, LookupLocation location) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(location, "location");
            resolutionScope.getContributedFunctions(name, location);
        }
    }

    /* JADX INFO: renamed from: getContributedClassifier */
    ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation lookupLocation);

    Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, InterfaceC1436k interfaceC1436k);

    Collection<? extends FunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation);

    /* JADX INFO: renamed from: recordLookup */
    void mo22593recordLookup(Name name, LookupLocation lookupLocation);
}
