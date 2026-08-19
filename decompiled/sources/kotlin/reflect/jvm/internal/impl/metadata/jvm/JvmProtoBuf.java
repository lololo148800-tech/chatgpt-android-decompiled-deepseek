package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf {
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> anonymousObjectOriginName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmMethodSignature> constructorSignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> flags;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, Boolean> isRaw;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> jvmClassFlags;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> lambdaClassOriginName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmMethodSignature> methodSignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmPropertySignature> propertySignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static Parser<JvmFieldSignature> PARSER = new C16585a();

        /* JADX INFO: renamed from: s0 */
        public static final JvmFieldSignature f52588s0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52589Y;

        /* JADX INFO: renamed from: Z */
        public int f52590Z;

        /* JADX INFO: renamed from: o0 */
        public int f52591o0;

        /* JADX INFO: renamed from: p0 */
        public int f52592p0;

        /* JADX INFO: renamed from: q0 */
        public byte f52593q0;

        /* JADX INFO: renamed from: r0 */
        public int f52594r0;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52595Z;

            /* JADX INFO: renamed from: o0 */
            public int f52596o0;

            /* JADX INFO: renamed from: p0 */
            public int f52597p0;

            public JvmFieldSignature buildPartial() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i10 = this.f52595Z;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f52591o0 = this.f52596o0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmFieldSignature.f52592p0 = this.f52597p0;
                jvmFieldSignature.f52590Z = i11;
                return jvmFieldSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i10) {
                this.f52595Z |= 2;
                this.f52597p0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f52595Z |= 1;
                this.f52596o0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmFieldSignature build() {
                JvmFieldSignature jvmFieldSignatureBuildPartial = buildPartial();
                if (jvmFieldSignatureBuildPartial.isInitialized()) {
                    return jvmFieldSignatureBuildPartial;
                }
                throw new UninitializedMessageException(jvmFieldSignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmFieldSignature getDefaultInstanceForType() {
                return JvmFieldSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    setName(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    setDesc(jvmFieldSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmFieldSignature.f52589Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmFieldSignature jvmFieldSignature = null;
                try {
                    try {
                        JvmFieldSignature partialFrom = JvmFieldSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmFieldSignature = jvmFieldSignature2;
                            if (jvmFieldSignature != null) {
                                mergeFrom(jvmFieldSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmFieldSignature != null) {
                        mergeFrom(jvmFieldSignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            f52588s0 = jvmFieldSignature;
            jvmFieldSignature.f52591o0 = 0;
            jvmFieldSignature.f52592p0 = 0;
        }

        public JvmFieldSignature() {
            this.f52593q0 = (byte) -1;
            this.f52594r0 = -1;
            this.f52589Y = ByteString.EMPTY;
        }

        public static JvmFieldSignature getDefaultInstance() {
            return f52588s0;
        }

        public static Builder newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().mergeFrom(jvmFieldSignature);
        }

        public int getDesc() {
            return this.f52592p0;
        }

        public int getName() {
            return this.f52591o0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmFieldSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52594r0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52590Z & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52591o0) : 0;
            if ((this.f52590Z & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52592p0);
            }
            int size = this.f52589Y.size() + iComputeInt32Size;
            this.f52594r0 = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.f52590Z & 2) == 2;
        }

        public boolean hasName() {
            return (this.f52590Z & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52593q0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f52593q0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f52590Z & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52591o0);
            }
            if ((this.f52590Z & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f52592p0);
            }
            codedOutputStream.writeRawBytes(this.f52589Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmFieldSignature getDefaultInstanceForType() {
            return f52588s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public JvmFieldSignature(CodedInputStream codedInputStream) {
            this.f52593q0 = (byte) -1;
            this.f52594r0 = -1;
            boolean z6 = false;
            this.f52591o0 = 0;
            this.f52592p0 = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f52590Z |= 1;
                                this.f52591o0 = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                this.f52590Z |= 2;
                                this.f52592p0 = codedInputStream.readInt32();
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52589Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52589Y = outputNewOutput.toByteString();
            }
        }

        public JvmFieldSignature(Builder builder) {
            this.f52593q0 = (byte) -1;
            this.f52594r0 = -1;
            this.f52589Y = builder.getUnknownFields();
        }
    }

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static Parser<JvmMethodSignature> PARSER = new C16586b();

        /* JADX INFO: renamed from: s0 */
        public static final JvmMethodSignature f52598s0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52599Y;

        /* JADX INFO: renamed from: Z */
        public int f52600Z;

        /* JADX INFO: renamed from: o0 */
        public int f52601o0;

        /* JADX INFO: renamed from: p0 */
        public int f52602p0;

        /* JADX INFO: renamed from: q0 */
        public byte f52603q0;

        /* JADX INFO: renamed from: r0 */
        public int f52604r0;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52605Z;

            /* JADX INFO: renamed from: o0 */
            public int f52606o0;

            /* JADX INFO: renamed from: p0 */
            public int f52607p0;

            public JvmMethodSignature buildPartial() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i10 = this.f52605Z;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f52601o0 = this.f52606o0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmMethodSignature.f52602p0 = this.f52607p0;
                jvmMethodSignature.f52600Z = i11;
                return jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i10) {
                this.f52605Z |= 2;
                this.f52607p0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f52605Z |= 1;
                this.f52606o0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmMethodSignature build() {
                JvmMethodSignature jvmMethodSignatureBuildPartial = buildPartial();
                if (jvmMethodSignatureBuildPartial.isInitialized()) {
                    return jvmMethodSignatureBuildPartial;
                }
                throw new UninitializedMessageException(jvmMethodSignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmMethodSignature getDefaultInstanceForType() {
                return JvmMethodSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    setName(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    setDesc(jvmMethodSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmMethodSignature.f52599Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmMethodSignature jvmMethodSignature = null;
                try {
                    try {
                        JvmMethodSignature partialFrom = JvmMethodSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmMethodSignature = jvmMethodSignature2;
                            if (jvmMethodSignature != null) {
                                mergeFrom(jvmMethodSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmMethodSignature != null) {
                        mergeFrom(jvmMethodSignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            f52598s0 = jvmMethodSignature;
            jvmMethodSignature.f52601o0 = 0;
            jvmMethodSignature.f52602p0 = 0;
        }

        public JvmMethodSignature() {
            this.f52603q0 = (byte) -1;
            this.f52604r0 = -1;
            this.f52599Y = ByteString.EMPTY;
        }

        public static JvmMethodSignature getDefaultInstance() {
            return f52598s0;
        }

        public static Builder newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().mergeFrom(jvmMethodSignature);
        }

        public int getDesc() {
            return this.f52602p0;
        }

        public int getName() {
            return this.f52601o0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmMethodSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52604r0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52600Z & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52601o0) : 0;
            if ((this.f52600Z & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52602p0);
            }
            int size = this.f52599Y.size() + iComputeInt32Size;
            this.f52604r0 = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.f52600Z & 2) == 2;
        }

        public boolean hasName() {
            return (this.f52600Z & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52603q0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f52603q0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f52600Z & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52601o0);
            }
            if ((this.f52600Z & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f52602p0);
            }
            codedOutputStream.writeRawBytes(this.f52599Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmMethodSignature getDefaultInstanceForType() {
            return f52598s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public JvmMethodSignature(CodedInputStream codedInputStream) {
            this.f52603q0 = (byte) -1;
            this.f52604r0 = -1;
            boolean z6 = false;
            this.f52601o0 = 0;
            this.f52602p0 = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f52600Z |= 1;
                                this.f52601o0 = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                this.f52600Z |= 2;
                                this.f52602p0 = codedInputStream.readInt32();
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52599Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52599Y = outputNewOutput.toByteString();
            }
        }

        public JvmMethodSignature(Builder builder) {
            this.f52603q0 = (byte) -1;
            this.f52604r0 = -1;
            this.f52599Y = builder.getUnknownFields();
        }
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static Parser<JvmPropertySignature> PARSER = new C16587c();

        /* JADX INFO: renamed from: v0 */
        public static final JvmPropertySignature f52608v0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52609Y;

        /* JADX INFO: renamed from: Z */
        public int f52610Z;

        /* JADX INFO: renamed from: o0 */
        public JvmFieldSignature f52611o0;

        /* JADX INFO: renamed from: p0 */
        public JvmMethodSignature f52612p0;

        /* JADX INFO: renamed from: q0 */
        public JvmMethodSignature f52613q0;

        /* JADX INFO: renamed from: r0 */
        public JvmMethodSignature f52614r0;

        /* JADX INFO: renamed from: s0 */
        public JvmMethodSignature f52615s0;

        /* JADX INFO: renamed from: t0 */
        public byte f52616t0;

        /* JADX INFO: renamed from: u0 */
        public int f52617u0;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52618Z;

            /* JADX INFO: renamed from: o0 */
            public JvmFieldSignature f52619o0 = JvmFieldSignature.getDefaultInstance();

            /* JADX INFO: renamed from: p0 */
            public JvmMethodSignature f52620p0 = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: q0 */
            public JvmMethodSignature f52621q0 = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: r0 */
            public JvmMethodSignature f52622r0 = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: s0 */
            public JvmMethodSignature f52623s0 = JvmMethodSignature.getDefaultInstance();

            public JvmPropertySignature buildPartial() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i10 = this.f52618Z;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f52611o0 = this.f52619o0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmPropertySignature.f52612p0 = this.f52620p0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                jvmPropertySignature.f52613q0 = this.f52621q0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                jvmPropertySignature.f52614r0 = this.f52622r0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                jvmPropertySignature.f52615s0 = this.f52623s0;
                jvmPropertySignature.f52610Z = i11;
                return jvmPropertySignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDelegateMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.f52618Z & 16) != 16 || this.f52623s0 == JvmMethodSignature.getDefaultInstance()) {
                    this.f52623s0 = jvmMethodSignature;
                } else {
                    this.f52623s0 = JvmMethodSignature.newBuilder(this.f52623s0).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f52618Z |= 16;
                return this;
            }

            public Builder mergeField(JvmFieldSignature jvmFieldSignature) {
                if ((this.f52618Z & 1) != 1 || this.f52619o0 == JvmFieldSignature.getDefaultInstance()) {
                    this.f52619o0 = jvmFieldSignature;
                } else {
                    this.f52619o0 = JvmFieldSignature.newBuilder(this.f52619o0).mergeFrom(jvmFieldSignature).buildPartial();
                }
                this.f52618Z |= 1;
                return this;
            }

            public Builder mergeGetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.f52618Z & 4) != 4 || this.f52621q0 == JvmMethodSignature.getDefaultInstance()) {
                    this.f52621q0 = jvmMethodSignature;
                } else {
                    this.f52621q0 = JvmMethodSignature.newBuilder(this.f52621q0).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f52618Z |= 4;
                return this;
            }

            public Builder mergeSetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.f52618Z & 8) != 8 || this.f52622r0 == JvmMethodSignature.getDefaultInstance()) {
                    this.f52622r0 = jvmMethodSignature;
                } else {
                    this.f52622r0 = JvmMethodSignature.newBuilder(this.f52622r0).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f52618Z |= 8;
                return this;
            }

            public Builder mergeSyntheticMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.f52618Z & 2) != 2 || this.f52620p0 == JvmMethodSignature.getDefaultInstance()) {
                    this.f52620p0 = jvmMethodSignature;
                } else {
                    this.f52620p0 = JvmMethodSignature.newBuilder(this.f52620p0).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f52618Z |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmPropertySignature build() {
                JvmPropertySignature jvmPropertySignatureBuildPartial = buildPartial();
                if (jvmPropertySignatureBuildPartial.isInitialized()) {
                    return jvmPropertySignatureBuildPartial;
                }
                throw new UninitializedMessageException(jvmPropertySignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmPropertySignature getDefaultInstanceForType() {
                return JvmPropertySignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    mergeField(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    mergeSyntheticMethod(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    mergeGetter(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    mergeSetter(jvmPropertySignature.getSetter());
                }
                if (jvmPropertySignature.hasDelegateMethod()) {
                    mergeDelegateMethod(jvmPropertySignature.getDelegateMethod());
                }
                setUnknownFields(getUnknownFields().concat(jvmPropertySignature.f52609Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmPropertySignature jvmPropertySignature = null;
                try {
                    try {
                        JvmPropertySignature partialFrom = JvmPropertySignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        JvmPropertySignature jvmPropertySignature2 = (JvmPropertySignature) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmPropertySignature = jvmPropertySignature2;
                            if (jvmPropertySignature != null) {
                                mergeFrom(jvmPropertySignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmPropertySignature != null) {
                        mergeFrom(jvmPropertySignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            f52608v0 = jvmPropertySignature;
            jvmPropertySignature.f52611o0 = JvmFieldSignature.getDefaultInstance();
            jvmPropertySignature.f52612p0 = JvmMethodSignature.getDefaultInstance();
            jvmPropertySignature.f52613q0 = JvmMethodSignature.getDefaultInstance();
            jvmPropertySignature.f52614r0 = JvmMethodSignature.getDefaultInstance();
            jvmPropertySignature.f52615s0 = JvmMethodSignature.getDefaultInstance();
        }

        public JvmPropertySignature() {
            this.f52616t0 = (byte) -1;
            this.f52617u0 = -1;
            this.f52609Y = ByteString.EMPTY;
        }

        public static JvmPropertySignature getDefaultInstance() {
            return f52608v0;
        }

        public static Builder newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().mergeFrom(jvmPropertySignature);
        }

        public JvmMethodSignature getDelegateMethod() {
            return this.f52615s0;
        }

        public JvmFieldSignature getField() {
            return this.f52611o0;
        }

        public JvmMethodSignature getGetter() {
            return this.f52613q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52617u0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = (this.f52610Z & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.f52611o0) : 0;
            if ((this.f52610Z & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.f52612p0);
            }
            if ((this.f52610Z & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f52613q0);
            }
            if ((this.f52610Z & 8) == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.f52614r0);
            }
            if ((this.f52610Z & 16) == 16) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.f52615s0);
            }
            int size = this.f52609Y.size() + iComputeMessageSize;
            this.f52617u0 = size;
            return size;
        }

        public JvmMethodSignature getSetter() {
            return this.f52614r0;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.f52612p0;
        }

        public boolean hasDelegateMethod() {
            return (this.f52610Z & 16) == 16;
        }

        public boolean hasField() {
            return (this.f52610Z & 1) == 1;
        }

        public boolean hasGetter() {
            return (this.f52610Z & 4) == 4;
        }

        public boolean hasSetter() {
            return (this.f52610Z & 8) == 8;
        }

        public boolean hasSyntheticMethod() {
            return (this.f52610Z & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52616t0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f52616t0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f52610Z & 1) == 1) {
                codedOutputStream.writeMessage(1, this.f52611o0);
            }
            if ((this.f52610Z & 2) == 2) {
                codedOutputStream.writeMessage(2, this.f52612p0);
            }
            if ((this.f52610Z & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f52613q0);
            }
            if ((this.f52610Z & 8) == 8) {
                codedOutputStream.writeMessage(4, this.f52614r0);
            }
            if ((this.f52610Z & 16) == 16) {
                codedOutputStream.writeMessage(5, this.f52615s0);
            }
            codedOutputStream.writeRawBytes(this.f52609Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmPropertySignature getDefaultInstanceForType() {
            return f52608v0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52616t0 = (byte) -1;
            this.f52617u0 = -1;
            this.f52611o0 = JvmFieldSignature.getDefaultInstance();
            this.f52612p0 = JvmMethodSignature.getDefaultInstance();
            this.f52613q0 = JvmMethodSignature.getDefaultInstance();
            this.f52614r0 = JvmMethodSignature.getDefaultInstance();
            this.f52615s0 = JvmMethodSignature.getDefaultInstance();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    JvmFieldSignature.Builder builder = (this.f52610Z & 1) == 1 ? this.f52611o0.toBuilder() : null;
                                    JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) codedInputStream.readMessage(JvmFieldSignature.PARSER, extensionRegistryLite);
                                    this.f52611o0 = jvmFieldSignature;
                                    if (builder != null) {
                                        builder.mergeFrom(jvmFieldSignature);
                                        this.f52611o0 = builder.buildPartial();
                                    }
                                    this.f52610Z |= 1;
                                } else if (tag == 18) {
                                    JvmMethodSignature.Builder builder2 = (this.f52610Z & 2) == 2 ? this.f52612p0.toBuilder() : null;
                                    JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                    this.f52612p0 = jvmMethodSignature;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(jvmMethodSignature);
                                        this.f52612p0 = builder2.buildPartial();
                                    }
                                    this.f52610Z |= 2;
                                } else if (tag == 26) {
                                    JvmMethodSignature.Builder builder3 = (this.f52610Z & 4) == 4 ? this.f52613q0.toBuilder() : null;
                                    JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                    this.f52613q0 = jvmMethodSignature2;
                                    if (builder3 != null) {
                                        builder3.mergeFrom(jvmMethodSignature2);
                                        this.f52613q0 = builder3.buildPartial();
                                    }
                                    this.f52610Z |= 4;
                                } else if (tag == 34) {
                                    JvmMethodSignature.Builder builder4 = (this.f52610Z & 8) == 8 ? this.f52614r0.toBuilder() : null;
                                    JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                    this.f52614r0 = jvmMethodSignature3;
                                    if (builder4 != null) {
                                        builder4.mergeFrom(jvmMethodSignature3);
                                        this.f52614r0 = builder4.buildPartial();
                                    }
                                    this.f52610Z |= 8;
                                } else if (tag != 42) {
                                    if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    JvmMethodSignature.Builder builder5 = (this.f52610Z & 16) == 16 ? this.f52615s0.toBuilder() : null;
                                    JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                    this.f52615s0 = jvmMethodSignature4;
                                    if (builder5 != null) {
                                        builder5.mergeFrom(jvmMethodSignature4);
                                        this.f52615s0 = builder5.buildPartial();
                                    }
                                    this.f52610Z |= 16;
                                }
                            }
                            z6 = true;
                        } catch (IOException e10) {
                            throw new InvalidProtocolBufferException(e10.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        throw e11.setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52609Y = outputNewOutput.toByteString();
                    }
                    throw th2;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52609Y = outputNewOutput.toByteString();
            }
        }

        public JvmPropertySignature(Builder builder) {
            this.f52616t0 = (byte) -1;
            this.f52617u0 = -1;
            this.f52609Y = builder.getUnknownFields();
        }
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static Parser<StringTableTypes> PARSER = new C16588d();

        /* JADX INFO: renamed from: s0 */
        public static final StringTableTypes f52624s0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52625Y;

        /* JADX INFO: renamed from: Z */
        public List f52626Z;

        /* JADX INFO: renamed from: o0 */
        public List f52627o0;

        /* JADX INFO: renamed from: p0 */
        public int f52628p0;

        /* JADX INFO: renamed from: q0 */
        public byte f52629q0;

        /* JADX INFO: renamed from: r0 */
        public int f52630r0;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52631Z;

            /* JADX INFO: renamed from: o0 */
            public List f52632o0 = Collections.emptyList();

            /* JADX INFO: renamed from: p0 */
            public List f52633p0 = Collections.emptyList();

            public StringTableTypes buildPartial() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f52631Z & 1) == 1) {
                    this.f52632o0 = DesugarCollections.unmodifiableList(this.f52632o0);
                    this.f52631Z &= -2;
                }
                stringTableTypes.f52626Z = this.f52632o0;
                if ((this.f52631Z & 2) == 2) {
                    this.f52633p0 = DesugarCollections.unmodifiableList(this.f52633p0);
                    this.f52631Z &= -3;
                }
                stringTableTypes.f52627o0 = this.f52633p0;
                return stringTableTypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTableTypes build() {
                StringTableTypes stringTableTypesBuildPartial = buildPartial();
                if (stringTableTypesBuildPartial.isInitialized()) {
                    return stringTableTypesBuildPartial;
                }
                throw new UninitializedMessageException(stringTableTypesBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTableTypes getDefaultInstanceForType() {
                return StringTableTypes.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.f52626Z.isEmpty()) {
                    if (this.f52632o0.isEmpty()) {
                        this.f52632o0 = stringTableTypes.f52626Z;
                        this.f52631Z &= -2;
                    } else {
                        if ((this.f52631Z & 1) != 1) {
                            this.f52632o0 = new ArrayList(this.f52632o0);
                            this.f52631Z |= 1;
                        }
                        this.f52632o0.addAll(stringTableTypes.f52626Z);
                    }
                }
                if (!stringTableTypes.f52627o0.isEmpty()) {
                    if (this.f52633p0.isEmpty()) {
                        this.f52633p0 = stringTableTypes.f52627o0;
                        this.f52631Z &= -3;
                    } else {
                        if ((this.f52631Z & 2) != 2) {
                            this.f52633p0 = new ArrayList(this.f52633p0);
                            this.f52631Z |= 2;
                        }
                        this.f52633p0.addAll(stringTableTypes.f52627o0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTableTypes.f52625Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTableTypes stringTableTypes = null;
                try {
                    try {
                        StringTableTypes partialFrom = StringTableTypes.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        StringTableTypes stringTableTypes2 = (StringTableTypes) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            stringTableTypes = stringTableTypes2;
                            if (stringTableTypes != null) {
                                mergeFrom(stringTableTypes);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (stringTableTypes != null) {
                        mergeFrom(stringTableTypes);
                    }
                    throw th;
                }
            }
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static Parser<Record> PARSER = new C16589e();

            /* JADX INFO: renamed from: y0 */
            public static final Record f52634y0;

            /* JADX INFO: renamed from: Y */
            public final ByteString f52635Y;

            /* JADX INFO: renamed from: Z */
            public int f52636Z;

            /* JADX INFO: renamed from: o0 */
            public int f52637o0;

            /* JADX INFO: renamed from: p0 */
            public int f52638p0;

            /* JADX INFO: renamed from: q0 */
            public Object f52639q0;

            /* JADX INFO: renamed from: r0 */
            public Operation f52640r0;

            /* JADX INFO: renamed from: s0 */
            public List f52641s0;

            /* JADX INFO: renamed from: t0 */
            public int f52642t0;

            /* JADX INFO: renamed from: u0 */
            public List f52643u0;

            /* JADX INFO: renamed from: v0 */
            public int f52644v0;

            /* JADX INFO: renamed from: w0 */
            public byte f52645w0;

            /* JADX INFO: renamed from: x0 */
            public int f52646x0;

            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* JADX INFO: renamed from: Z */
                public int f52647Z;

                /* JADX INFO: renamed from: p0 */
                public int f52649p0;

                /* JADX INFO: renamed from: o0 */
                public int f52648o0 = 1;

                /* JADX INFO: renamed from: q0 */
                public Object f52650q0 = "";

                /* JADX INFO: renamed from: r0 */
                public Operation f52651r0 = Operation.NONE;

                /* JADX INFO: renamed from: s0 */
                public List f52652s0 = Collections.emptyList();

                /* JADX INFO: renamed from: t0 */
                public List f52653t0 = Collections.emptyList();

                public Record buildPartial() {
                    Record record = new Record(this);
                    int i10 = this.f52647Z;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    record.f52637o0 = this.f52648o0;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    record.f52638p0 = this.f52649p0;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    record.f52639q0 = this.f52650q0;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    record.f52640r0 = this.f52651r0;
                    if ((i10 & 16) == 16) {
                        this.f52652s0 = DesugarCollections.unmodifiableList(this.f52652s0);
                        this.f52647Z &= -17;
                    }
                    record.f52641s0 = this.f52652s0;
                    if ((this.f52647Z & 32) == 32) {
                        this.f52653t0 = DesugarCollections.unmodifiableList(this.f52653t0);
                        this.f52647Z &= -33;
                    }
                    record.f52643u0 = this.f52653t0;
                    record.f52636Z = i11;
                    return record;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setOperation(Operation operation) {
                    operation.getClass();
                    this.f52647Z |= 8;
                    this.f52651r0 = operation;
                    return this;
                }

                public Builder setPredefinedIndex(int i10) {
                    this.f52647Z |= 2;
                    this.f52649p0 = i10;
                    return this;
                }

                public Builder setRange(int i10) {
                    this.f52647Z |= 1;
                    this.f52648o0 = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Record build() {
                    Record recordBuildPartial = buildPartial();
                    if (recordBuildPartial.isInitialized()) {
                        return recordBuildPartial;
                    }
                    throw new UninitializedMessageException(recordBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Record getDefaultInstanceForType() {
                    return Record.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo22588clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        setRange(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        setPredefinedIndex(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.f52647Z |= 4;
                        this.f52650q0 = record.f52639q0;
                    }
                    if (record.hasOperation()) {
                        setOperation(record.getOperation());
                    }
                    if (!record.f52641s0.isEmpty()) {
                        if (this.f52652s0.isEmpty()) {
                            this.f52652s0 = record.f52641s0;
                            this.f52647Z &= -17;
                        } else {
                            if ((this.f52647Z & 16) != 16) {
                                this.f52652s0 = new ArrayList(this.f52652s0);
                                this.f52647Z |= 16;
                            }
                            this.f52652s0.addAll(record.f52641s0);
                        }
                    }
                    if (!record.f52643u0.isEmpty()) {
                        if (this.f52653t0.isEmpty()) {
                            this.f52653t0 = record.f52643u0;
                            this.f52647Z &= -33;
                        } else {
                            if ((this.f52647Z & 32) != 32) {
                                this.f52653t0 = new ArrayList(this.f52653t0);
                                this.f52647Z |= 32;
                            }
                            this.f52653t0.addAll(record.f52643u0);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(record.f52635Y));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Record record = null;
                    try {
                        try {
                            Record partialFrom = Record.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Record record2 = (Record) e10.getUnfinishedMessage();
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                record = record2;
                                if (record != null) {
                                    mergeFrom(record);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (record != null) {
                            mergeFrom(record);
                        }
                        throw th;
                    }
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);


                /* JADX INFO: renamed from: Y */
                public final int f52655Y;

                Operation(int i10) {
                    this.f52655Y = i10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f52655Y;
                }

                public static Operation valueOf(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            static {
                Record record = new Record();
                f52634y0 = record;
                record.f52637o0 = 1;
                record.f52638p0 = 0;
                record.f52639q0 = "";
                record.f52640r0 = Operation.NONE;
                record.f52641s0 = Collections.emptyList();
                record.f52643u0 = Collections.emptyList();
            }

            public Record() {
                this.f52642t0 = -1;
                this.f52644v0 = -1;
                this.f52645w0 = (byte) -1;
                this.f52646x0 = -1;
                this.f52635Y = ByteString.EMPTY;
            }

            public static Record getDefaultInstance() {
                return f52634y0;
            }

            public static Builder newBuilder(Record record) {
                return newBuilder().mergeFrom(record);
            }

            public Operation getOperation() {
                return this.f52640r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Record> getParserForType() {
                return PARSER;
            }

            public int getPredefinedIndex() {
                return this.f52638p0;
            }

            public int getRange() {
                return this.f52637o0;
            }

            public int getReplaceCharCount() {
                return this.f52643u0.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.f52643u0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.f52646x0;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeInt32Size = (this.f52636Z & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52637o0) : 0;
                if ((this.f52636Z & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52638p0);
                }
                if ((this.f52636Z & 8) == 8) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f52640r0.getNumber());
                }
                int iComputeInt32SizeNoTag = 0;
                for (int i11 = 0; i11 < this.f52641s0.size(); i11++) {
                    iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52641s0.get(i11)).intValue());
                }
                int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
                if (!getSubstringIndexList().isEmpty()) {
                    iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
                }
                this.f52642t0 = iComputeInt32SizeNoTag;
                int iComputeInt32SizeNoTag3 = 0;
                for (int i12 = 0; i12 < this.f52643u0.size(); i12++) {
                    iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52643u0.get(i12)).intValue());
                }
                int iComputeBytesSize = iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3;
                if (!getReplaceCharList().isEmpty()) {
                    iComputeBytesSize = iComputeBytesSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
                }
                this.f52644v0 = iComputeInt32SizeNoTag3;
                if ((this.f52636Z & 4) == 4) {
                    iComputeBytesSize += CodedOutputStream.computeBytesSize(6, getStringBytes());
                }
                int size = this.f52635Y.size() + iComputeBytesSize;
                this.f52646x0 = size;
                return size;
            }

            public String getString() {
                Object obj = this.f52639q0;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f52639q0 = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getStringBytes() {
                Object obj = this.f52639q0;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.f52639q0 = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public int getSubstringIndexCount() {
                return this.f52641s0.size();
            }

            public List<Integer> getSubstringIndexList() {
                return this.f52641s0;
            }

            public boolean hasOperation() {
                return (this.f52636Z & 8) == 8;
            }

            public boolean hasPredefinedIndex() {
                return (this.f52636Z & 2) == 2;
            }

            public boolean hasRange() {
                return (this.f52636Z & 1) == 1;
            }

            public boolean hasString() {
                return (this.f52636Z & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f52645w0;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f52645w0 = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f52636Z & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f52637o0);
                }
                if ((this.f52636Z & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.f52638p0);
                }
                if ((this.f52636Z & 8) == 8) {
                    codedOutputStream.writeEnum(3, this.f52640r0.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.writeRawVarint32(34);
                    codedOutputStream.writeRawVarint32(this.f52642t0);
                }
                for (int i10 = 0; i10 < this.f52641s0.size(); i10++) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.f52641s0.get(i10)).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.writeRawVarint32(42);
                    codedOutputStream.writeRawVarint32(this.f52644v0);
                }
                for (int i11 = 0; i11 < this.f52643u0.size(); i11++) {
                    codedOutputStream.writeInt32NoTag(((Integer) this.f52643u0.get(i11)).intValue());
                }
                if ((this.f52636Z & 4) == 4) {
                    codedOutputStream.writeBytes(6, getStringBytes());
                }
                codedOutputStream.writeRawBytes(this.f52635Y);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Record getDefaultInstanceForType() {
                return f52634y0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public Record(CodedInputStream codedInputStream) {
                this.f52642t0 = -1;
                this.f52644v0 = -1;
                this.f52645w0 = (byte) -1;
                this.f52646x0 = -1;
                this.f52637o0 = 1;
                boolean z6 = false;
                this.f52638p0 = 0;
                this.f52639q0 = "";
                this.f52640r0 = Operation.NONE;
                this.f52641s0 = Collections.emptyList();
                this.f52643u0 = Collections.emptyList();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                int i10 = 0;
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f52636Z |= 1;
                                    this.f52637o0 = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.f52636Z |= 2;
                                    this.f52638p0 = codedInputStream.readInt32();
                                } else if (tag == 24) {
                                    int i11 = codedInputStream.readEnum();
                                    Operation operationValueOf = Operation.valueOf(i11);
                                    if (operationValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i11);
                                    } else {
                                        this.f52636Z |= 8;
                                        this.f52640r0 = operationValueOf;
                                    }
                                } else if (tag == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f52641s0 = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f52641s0.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag == 34) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i10 & 16) != 16 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f52641s0 = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f52641s0.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f52643u0 = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f52643u0.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag == 42) {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i10 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f52643u0 = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f52643u0.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                } else if (tag != 50) {
                                    if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.f52636Z |= 4;
                                    this.f52639q0 = bytes;
                                }
                            }
                            z6 = true;
                        } catch (Throwable th2) {
                            if ((i10 & 16) == 16) {
                                this.f52641s0 = DesugarCollections.unmodifiableList(this.f52641s0);
                            }
                            if ((i10 & 32) == 32) {
                                this.f52643u0 = DesugarCollections.unmodifiableList(this.f52643u0);
                            }
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } finally {
                                this.f52635Y = outputNewOutput.toByteString();
                            }
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f52641s0 = DesugarCollections.unmodifiableList(this.f52641s0);
                }
                if ((i10 & 32) == 32) {
                    this.f52643u0 = DesugarCollections.unmodifiableList(this.f52643u0);
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f52635Y = outputNewOutput.toByteString();
                }
            }

            public Record(Builder builder) {
                this.f52642t0 = -1;
                this.f52644v0 = -1;
                this.f52645w0 = (byte) -1;
                this.f52646x0 = -1;
                this.f52635Y = builder.getUnknownFields();
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            f52624s0 = stringTableTypes;
            stringTableTypes.f52626Z = Collections.emptyList();
            stringTableTypes.f52627o0 = Collections.emptyList();
        }

        public StringTableTypes() {
            this.f52628p0 = -1;
            this.f52629q0 = (byte) -1;
            this.f52630r0 = -1;
            this.f52625Y = ByteString.EMPTY;
        }

        public static StringTableTypes getDefaultInstance() {
            return f52624s0;
        }

        public static Builder newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().mergeFrom(stringTableTypes);
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public List<Integer> getLocalNameList() {
            return this.f52627o0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.f52626Z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52630r0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f52626Z.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f52626Z.get(i11));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < this.f52627o0.size(); i12++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52627o0.get(i12)).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeMessageSize + iComputeInt32SizeNoTag;
            if (!getLocalNameList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f52628p0 = iComputeInt32SizeNoTag;
            int size = this.f52625Y.size() + iComputeInt32SizeNoTag2;
            this.f52630r0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52629q0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f52629q0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f52626Z.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f52626Z.get(i10));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(42);
                codedOutputStream.writeRawVarint32(this.f52628p0);
            }
            for (int i11 = 0; i11 < this.f52627o0.size(); i11++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52627o0.get(i11)).intValue());
            }
            codedOutputStream.writeRawBytes(this.f52625Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTableTypes getDefaultInstanceForType() {
            return f52624s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52628p0 = -1;
            this.f52629q0 = (byte) -1;
            this.f52630r0 = -1;
            this.f52626Z = Collections.emptyList();
            this.f52627o0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            int i10 = 0;
            while (!z6) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    if ((i10 & 1) != 1) {
                                        this.f52626Z = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.f52626Z.add(codedInputStream.readMessage(Record.PARSER, extensionRegistryLite));
                                } else if (tag == 40) {
                                    if ((i10 & 2) != 2) {
                                        this.f52627o0 = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.f52627o0.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag != 42) {
                                    if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i10 & 2) != 2 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f52627o0 = new ArrayList();
                                        i10 |= 2;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f52627o0.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) == 1) {
                        this.f52626Z = DesugarCollections.unmodifiableList(this.f52626Z);
                    }
                    if ((i10 & 2) == 2) {
                        this.f52627o0 = DesugarCollections.unmodifiableList(this.f52627o0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52625Y = outputNewOutput.toByteString();
                    }
                    throw th2;
                }
            }
            if ((i10 & 1) == 1) {
                this.f52626Z = DesugarCollections.unmodifiableList(this.f52626Z);
            }
            if ((i10 & 2) == 2) {
                this.f52627o0 = DesugarCollections.unmodifiableList(this.f52627o0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52625Y = outputNewOutput.toByteString();
            }
        }

        public StringTableTypes(Builder builder) {
            this.f52628p0 = -1;
            this.f52629q0 = (byte) -1;
            this.f52630r0 = -1;
            this.f52625Y = builder.getUnknownFields();
        }
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        ProtoBuf.Constructor defaultInstance = ProtoBuf.Constructor.getDefaultInstance();
        JvmMethodSignature defaultInstance2 = JvmMethodSignature.getDefaultInstance();
        JvmMethodSignature defaultInstance3 = JvmMethodSignature.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        constructorSignature = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, 100, fieldType, JvmMethodSignature.class);
        methodSignature = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function defaultInstance4 = ProtoBuf.Function.getDefaultInstance();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.INT32;
        lambdaClassOriginName = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance4, 0, null, null, 101, fieldType2, Integer.class);
        propertySignature = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, fieldType, JvmPropertySignature.class);
        flags = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        typeAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        isRaw = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.BOOL, Boolean.class);
        typeParameterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        classModuleName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        classLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
        anonymousObjectOriginName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 103, fieldType2, Integer.class);
        jvmClassFlags = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 104, fieldType2, Integer.class);
        packageModuleName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        packageLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(constructorSignature);
        extensionRegistryLite.add(methodSignature);
        extensionRegistryLite.add(lambdaClassOriginName);
        extensionRegistryLite.add(propertySignature);
        extensionRegistryLite.add(flags);
        extensionRegistryLite.add(typeAnnotation);
        extensionRegistryLite.add(isRaw);
        extensionRegistryLite.add(typeParameterAnnotation);
        extensionRegistryLite.add(classModuleName);
        extensionRegistryLite.add(classLocalVariable);
        extensionRegistryLite.add(anonymousObjectOriginName);
        extensionRegistryLite.add(jvmClassFlags);
        extensionRegistryLite.add(packageModuleName);
        extensionRegistryLite.add(packageLocalVariable);
    }
}
