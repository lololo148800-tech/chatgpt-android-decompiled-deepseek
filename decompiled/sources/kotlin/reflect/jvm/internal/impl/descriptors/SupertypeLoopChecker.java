package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public interface SupertypeLoopChecker {

    public static final class EMPTY implements SupertypeLoopChecker {
        public static final EMPTY INSTANCE = new EMPTY();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        public Collection<KotlinType> findLoopsInSupertypesAndDisconnect(TypeConstructor currentTypeConstructor, Collection<? extends KotlinType> superTypes, InterfaceC1436k neighbors, InterfaceC1436k reportLoop) {
            AbstractC16544l.m18094g(currentTypeConstructor, "currentTypeConstructor");
            AbstractC16544l.m18094g(superTypes, "superTypes");
            AbstractC16544l.m18094g(neighbors, "neighbors");
            AbstractC16544l.m18094g(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection<KotlinType> findLoopsInSupertypesAndDisconnect(TypeConstructor typeConstructor, Collection<? extends KotlinType> collection, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2);
}
