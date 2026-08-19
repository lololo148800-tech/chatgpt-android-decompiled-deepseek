package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public interface ModuleVisibilityHelper {

    public static final class EMPTY implements ModuleVisibilityHelper {
        public static final EMPTY INSTANCE = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public boolean isInFriendModule(DeclarationDescriptor what, DeclarationDescriptor from) {
            AbstractC16544l.m18094g(what, "what");
            AbstractC16544l.m18094g(from, "from");
            return true;
        }
    }

    boolean isInFriendModule(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2);
}
