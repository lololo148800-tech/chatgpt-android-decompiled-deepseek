package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import mm.C17309l;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaCallableMemberDescriptor extends CallableMemberDescriptor {
    JavaCallableMemberDescriptor enhance(KotlinType kotlinType, List<KotlinType> list, KotlinType kotlinType2, C17309l c17309l);
}
