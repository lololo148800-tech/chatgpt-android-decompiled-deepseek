package kotlin.reflect.jvm.internal.impl.load.kotlin;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p1113xn.AbstractC21322p;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: d */
    public final ModuleDescriptor f52025d;

    /* JADX INFO: renamed from: e */
    public final NotFoundClasses f52026e;

    /* JADX INFO: renamed from: f */
    public final AnnotationDeserializer f52027f;

    /* JADX INFO: renamed from: g */
    public JvmMetadataVersion f52028g;

    public abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visit(Name name, Object obj) {
            visitConstantValue(name, BinaryClassAnnotationAndConstantLoaderImpl.access$createConstant(BinaryClassAnnotationAndConstantLoaderImpl.this, name, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(final Name name, ClassId classId) {
            AbstractC16544l.m18094g(classId, "classId");
            final ArrayList arrayList = new ArrayList();
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            AbstractC16544l.m18093f(NO_SOURCE, "NO_SOURCE");
            final C165701 c165701Mo18239e = BinaryClassAnnotationAndConstantLoaderImpl.this.mo18239e(classId, NO_SOURCE, arrayList);
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.C165701 f52030a;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f52032c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Name f52033d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ArrayList f52034e;

                {
                    this.f52032c = this;
                    this.f52033d = name;
                    this.f52034e = arrayList;
                    this.f52030a = this.f52031b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visit(Name name2, Object obj) {
                    visit(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name2, ClassId classId2) {
                    AbstractC16544l.m18094g(classId2, "classId");
                    return visitAnnotation(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name2) {
                    return visitArray(name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitClassLiteral(Name name2, ClassLiteralValue value) {
                    AbstractC16544l.m18094g(value, "value");
                    visitClassLiteral(name2, value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnd() {
                    visitEnd();
                    this.f52032c.visitConstantValue(this.f52033d, new AnnotationValue((AnnotationDescriptor) AbstractC17680n.m19365o0(this.f52034e)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnum(Name name2, ClassId enumClassId, Name enumEntryName) {
                    AbstractC16544l.m18094g(enumClassId, "enumClassId");
                    AbstractC16544l.m18094g(enumEntryName, "enumEntryName");
                    visitEnum(name2, enumClassId, enumEntryName);
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
            return new C16568x4262547b(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        public abstract void visitArrayValue(Name name, ArrayList arrayList);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitClassLiteral(Name name, ClassLiteralValue value) {
            AbstractC16544l.m18094g(value, "value");
            visitConstantValue(name, new KClassValue(value));
        }

        public abstract void visitConstantValue(Name name, ConstantValue constantValue);

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        public void visitEnum(Name name, ClassId enumClassId, Name enumEntryName) {
            AbstractC16544l.m18094g(enumClassId, "enumClassId");
            AbstractC16544l.m18094g(enumEntryName, "enumEntryName");
            visitConstantValue(name, new EnumValue(enumClassId, enumEntryName));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(ModuleDescriptor module, NotFoundClasses notFoundClasses, StorageManager storageManager, KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(kotlinClassFinder, "kotlinClassFinder");
        this.f52025d = module;
        this.f52026e = notFoundClasses;
        this.f52027f = new AnnotationDeserializer(module, notFoundClasses);
        this.f52028g = JvmMetadataVersion.INSTANCE;
    }

    public static final ConstantValue access$createConstant(BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl, Name name, Object obj) {
        ConstantValue<?> constantValueCreateConstantValue = ConstantValueFactory.INSTANCE.createConstantValue(obj, binaryClassAnnotationAndConstantLoaderImpl.f52025d);
        if (constantValueCreateConstantValue != null) {
            return constantValueCreateConstantValue;
        }
        return ErrorValue.Companion.create("Unsupported annotation argument: " + name);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1] */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    /* JADX INFO: renamed from: e */
    public final C165701 mo18239e(final ClassId annotationClassId, final SourceElement source, final List result) {
        AbstractC16544l.m18094g(annotationClassId, "annotationClassId");
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(result, "result");
        final ClassDescriptor classDescriptorFindNonGenericClassAcrossDependencies = FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.f52025d, annotationClassId, this.f52026e);
        return new AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.loadAnnotation.1

            /* JADX INFO: renamed from: b */
            public final HashMap f52043b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.f52043b = new HashMap();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitArrayValue(Name name, ArrayList<ConstantValue<?>> elements) {
                AbstractC16544l.m18094g(elements, "elements");
                if (name == null) {
                    return;
                }
                ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, classDescriptorFindNonGenericClassAcrossDependencies);
                if (annotationParameterByName != null) {
                    HashMap map = this.f52043b;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                    List<? extends ConstantValue<?>> listCompact = CollectionsKt.compact(elements);
                    KotlinType type = annotationParameterByName.getType();
                    AbstractC16544l.m18093f(type, "getType(...)");
                    map.put(name, constantValueFactory.createArrayValue(listCompact, type));
                    return;
                }
                if (BinaryClassAnnotationAndConstantLoaderImpl.this.m18238d(annotationClassId) && AbstractC16544l.m18089b(name.asString(), "value")) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : elements) {
                        if (obj instanceof AnnotationValue) {
                            arrayList.add(obj);
                        }
                    }
                    List list = result;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        list.add(((AnnotationValue) it.next()).getValue());
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            public void visitConstantValue(Name name, ConstantValue<?> value) {
                AbstractC16544l.m18094g(value, "value");
                if (name != null) {
                    this.f52043b.put(name, value);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                HashMap arguments = this.f52043b;
                BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = BinaryClassAnnotationAndConstantLoaderImpl.this;
                binaryClassAnnotationAndConstantLoaderImpl.getClass();
                ClassId annotationClassId2 = annotationClassId;
                AbstractC16544l.m18094g(annotationClassId2, "annotationClassId");
                AbstractC16544l.m18094g(arguments, "arguments");
                boolean zM18238d = false;
                if (annotationClassId2.equals(SpecialJvmAnnotations.INSTANCE.getJAVA_LANG_ANNOTATION_REPEATABLE())) {
                    Object obj = arguments.get(Name.identifier("value"));
                    KClassValue kClassValue = obj instanceof KClassValue ? (KClassValue) obj : null;
                    if (kClassValue != null) {
                        KClassValue.Value value = kClassValue.getValue();
                        KClassValue.Value.NormalClass normalClass = value instanceof KClassValue.Value.NormalClass ? (KClassValue.Value.NormalClass) value : null;
                        if (normalClass != null) {
                            zM18238d = binaryClassAnnotationAndConstantLoaderImpl.m18238d(normalClass.getClassId());
                        }
                    }
                }
                if (zM18238d || binaryClassAnnotationAndConstantLoaderImpl.m18238d(annotationClassId2)) {
                    return;
                }
                result.add(new AnnotationDescriptorImpl(classDescriptorFindNonGenericClassAcrossDependencies.getDefaultType(), arguments, source));
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public JvmMetadataVersion getJvmMetadataVersion() {
        return this.f52028g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public Object loadConstant(String desc, Object initializer) {
        AbstractC16544l.m18094g(desc, "desc");
        AbstractC16544l.m18094g(initializer, "initializer");
        if (AbstractC21322p.m21667A("ZBCS", desc, false)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals(TokenNames.f32009C)) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals(TokenNames.f32018S)) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return ConstantValueFactory.INSTANCE.createConstantValue(initializer, this.f52025d);
    }

    public void setJvmMetadataVersion(JvmMetadataVersion jvmMetadataVersion) {
        AbstractC16544l.m18094g(jvmMetadataVersion, "<set-?>");
        this.f52028g = jvmMetadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    public Object transformToUnsignedConstant(Object obj) {
        Object uLongValue;
        ConstantValue constant = (ConstantValue) obj;
        AbstractC16544l.m18094g(constant, "constant");
        if (constant instanceof ByteValue) {
            uLongValue = new UByteValue(((ByteValue) constant).getValue().byteValue());
        } else if (constant instanceof ShortValue) {
            uLongValue = new UShortValue(((ShortValue) constant).getValue().shortValue());
        } else if (constant instanceof IntValue) {
            uLongValue = new UIntValue(((IntValue) constant).getValue().intValue());
        } else {
            if (!(constant instanceof LongValue)) {
                return constant;
            }
            uLongValue = new ULongValue(((LongValue) constant).getValue().longValue());
        }
        return uLongValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public AnnotationDescriptor loadAnnotation(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        AbstractC16544l.m18094g(proto, "proto");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        return this.f52027f.deserializeAnnotation(proto, nameResolver);
    }
}
