package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p877ln.C17070b;

/* JADX INFO: loaded from: classes2.dex */
public interface ErrorReporter {
    public static final ErrorReporter DO_NOTHING = new C17070b();

    void reportCannotInferVisibility(CallableMemberDescriptor callableMemberDescriptor);

    void reportIncompleteHierarchy(ClassDescriptor classDescriptor, List<String> list);
}
