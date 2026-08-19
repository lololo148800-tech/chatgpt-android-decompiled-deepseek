package p910nn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: nn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C17696d extends AbstractClassTypeConstructor {

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f56493c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DeserializedClassDescriptor f56494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17696d(DeserializedClassDescriptor deserializedClassDescriptor) {
        super(deserializedClassDescriptor.getC().getStorageManager());
        this.f56494d = deserializedClassDescriptor;
        this.f56493c = deserializedClassDescriptor.getC().getStorageManager().createLazyValue(new C17693a(deserializedClassDescriptor, 6));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: b */
    public final Collection mo7319b() {
        String strAsString;
        FqName fqNameAsSingleFqName;
        DeserializedClassDescriptor deserializedClassDescriptor = this.f56494d;
        List<ProtoBuf.Type> listSupertypes = ProtoTypeTableUtilKt.supertypes(deserializedClassDescriptor.getClassProto(), deserializedClassDescriptor.getC().getTypeTable());
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listSupertypes, 10));
        Iterator<T> it = listSupertypes.iterator();
        while (it.hasNext()) {
            arrayList.add(deserializedClassDescriptor.getC().getTypeDeserializer().type((ProtoBuf.Type) it.next()));
        }
        ArrayList arrayListM19361k0 = AbstractC17680n.m19361k0(deserializedClassDescriptor.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(deserializedClassDescriptor), arrayList);
        ArrayList<NotFoundClasses.MockClassDescriptor> arrayList2 = new ArrayList();
        Iterator it2 = arrayListM19361k0.iterator();
        while (it2.hasNext()) {
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((KotlinType) it2.next()).getConstructor().mo22589getDeclarationDescriptor();
            NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
            if (mockClassDescriptor != null) {
                arrayList2.add(mockClassDescriptor);
            }
        }
        if (!arrayList2.isEmpty()) {
            ErrorReporter errorReporter = deserializedClassDescriptor.getC().getComponents().getErrorReporter();
            ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
            for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                if (classId == null || (fqNameAsSingleFqName = classId.asSingleFqName()) == null || (strAsString = fqNameAsSingleFqName.asString()) == null) {
                    strAsString = mockClassDescriptor2.getName().asString();
                    AbstractC16544l.m18093f(strAsString, "asString(...)");
                }
                arrayList3.add(strAsString);
            }
            errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor, arrayList3);
        }
        return AbstractC17680n.m19322C0(arrayListM19361k0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    /* JADX INFO: renamed from: e */
    public final SupertypeLoopChecker mo7321e() {
        return SupertypeLoopChecker.EMPTY.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassDescriptor mo22589getDeclarationDescriptor() {
        return this.f56494d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return (List) this.f56493c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean isDenotable() {
        return true;
    }

    public final String toString() {
        String string = this.f56494d.getName().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public final ClassifierDescriptor mo22589getDeclarationDescriptor() {
        return this.f56494d;
    }
}
