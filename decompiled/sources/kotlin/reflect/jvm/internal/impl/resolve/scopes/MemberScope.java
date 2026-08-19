package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kn.C16480b;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p049Bm.InterfaceC1436k;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public interface MemberScope extends ResolutionScope {
    public static final Companion Companion = Companion.f52937a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f52937a = new Companion();

        public final InterfaceC1436k getALL_NAME_FILTER() {
            return C16480b.f51120Z;
        }
    }

    public static final class DefaultImpls {
        public static void recordLookup(MemberScope memberScope, Name name, LookupLocation location) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(location, "location");
            ResolutionScope.DefaultImpls.recordLookup(memberScope, name, location);
        }
    }

    public static final class Empty extends MemberScopeImpl {
        public static final Empty INSTANCE = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> getClassifierNames() {
            return C17691y.f56482Y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> getFunctionNames() {
            return C17691y.f56482Y;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> getVariableNames() {
            return C17691y.f56482Y;
        }
    }

    Set<Name> getClassifierNames();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation);

    Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation);

    Set<Name> getFunctionNames();

    Set<Name> getVariableNames();
}
