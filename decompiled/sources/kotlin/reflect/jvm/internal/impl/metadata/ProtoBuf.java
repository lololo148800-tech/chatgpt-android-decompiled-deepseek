package kotlin.reflect.jvm.internal.impl.metadata;

import android.gov.nist.javax.sip.parser.TokenTypes;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.statsig.androidsdk.StatsigLoggerKt;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import livekit.LivekitInternal$NodeStats;
import p817j$.util.DesugarCollections;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf {

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new C16574a();

        /* JADX INFO: renamed from: s0 */
        public static final Annotation f52112s0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52113Y;

        /* JADX INFO: renamed from: Z */
        public int f52114Z;

        /* JADX INFO: renamed from: o0 */
        public int f52115o0;

        /* JADX INFO: renamed from: p0 */
        public List f52116p0;

        /* JADX INFO: renamed from: q0 */
        public byte f52117q0;

        /* JADX INFO: renamed from: r0 */
        public int f52118r0;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new C16575b();

            /* JADX INFO: renamed from: s0 */
            public static final Argument f52119s0;

            /* JADX INFO: renamed from: Y */
            public final ByteString f52120Y;

            /* JADX INFO: renamed from: Z */
            public int f52121Z;

            /* JADX INFO: renamed from: o0 */
            public int f52122o0;

            /* JADX INFO: renamed from: p0 */
            public Value f52123p0;

            /* JADX INFO: renamed from: q0 */
            public byte f52124q0;

            /* JADX INFO: renamed from: r0 */
            public int f52125r0;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: Z */
                public int f52126Z;

                /* JADX INFO: renamed from: o0 */
                public int f52127o0;

                /* JADX INFO: renamed from: p0 */
                public Value f52128p0 = Value.getDefaultInstance();

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i10 = this.f52126Z;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f52122o0 = this.f52127o0;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f52123p0 = this.f52128p0;
                    argument.f52121Z = i11;
                    return argument;
                }

                public Value getValue() {
                    return this.f52128p0;
                }

                public boolean hasNameId() {
                    return (this.f52126Z & 1) == 1;
                }

                public boolean hasValue() {
                    return (this.f52126Z & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasNameId() && hasValue() && getValue().isInitialized();
                }

                public Builder mergeValue(Value value) {
                    if ((this.f52126Z & 2) != 2 || this.f52128p0 == Value.getDefaultInstance()) {
                        this.f52128p0 = value;
                    } else {
                        this.f52128p0 = Value.newBuilder(this.f52128p0).mergeFrom(value).buildPartial();
                    }
                    this.f52126Z |= 2;
                    return this;
                }

                public Builder setNameId(int i10) {
                    this.f52126Z |= 1;
                    this.f52127o0 = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw new UninitializedMessageException(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
                public Builder mo22588clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.f52120Y));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Argument argument2 = (Argument) e10.getUnfinishedMessage();
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {

                /* JADX INFO: renamed from: B0 */
                public static final Value f52129B0;
                public static Parser<Value> PARSER = new C16576c();

                /* JADX INFO: renamed from: A0 */
                public int f52130A0;

                /* JADX INFO: renamed from: Y */
                public final ByteString f52131Y;

                /* JADX INFO: renamed from: Z */
                public int f52132Z;

                /* JADX INFO: renamed from: o0 */
                public Type f52133o0;

                /* JADX INFO: renamed from: p0 */
                public long f52134p0;

                /* JADX INFO: renamed from: q0 */
                public float f52135q0;

                /* JADX INFO: renamed from: r0 */
                public double f52136r0;

                /* JADX INFO: renamed from: s0 */
                public int f52137s0;

                /* JADX INFO: renamed from: t0 */
                public int f52138t0;

                /* JADX INFO: renamed from: u0 */
                public int f52139u0;

                /* JADX INFO: renamed from: v0 */
                public Annotation f52140v0;

                /* JADX INFO: renamed from: w0 */
                public List f52141w0;

                /* JADX INFO: renamed from: x0 */
                public int f52142x0;

                /* JADX INFO: renamed from: y0 */
                public int f52143y0;

                /* JADX INFO: renamed from: z0 */
                public byte f52144z0;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {

                    /* JADX INFO: renamed from: Z */
                    public int f52145Z;

                    /* JADX INFO: renamed from: p0 */
                    public long f52147p0;

                    /* JADX INFO: renamed from: q0 */
                    public float f52148q0;

                    /* JADX INFO: renamed from: r0 */
                    public double f52149r0;

                    /* JADX INFO: renamed from: s0 */
                    public int f52150s0;

                    /* JADX INFO: renamed from: t0 */
                    public int f52151t0;

                    /* JADX INFO: renamed from: u0 */
                    public int f52152u0;

                    /* JADX INFO: renamed from: x0 */
                    public int f52155x0;

                    /* JADX INFO: renamed from: y0 */
                    public int f52156y0;

                    /* JADX INFO: renamed from: o0 */
                    public Type f52146o0 = Type.BYTE;

                    /* JADX INFO: renamed from: v0 */
                    public Annotation f52153v0 = Annotation.getDefaultInstance();

                    /* JADX INFO: renamed from: w0 */
                    public List f52154w0 = Collections.emptyList();

                    public Value buildPartial() {
                        Value value = new Value(this);
                        int i10 = this.f52145Z;
                        int i11 = (i10 & 1) != 1 ? 0 : 1;
                        value.f52133o0 = this.f52146o0;
                        if ((i10 & 2) == 2) {
                            i11 |= 2;
                        }
                        value.f52134p0 = this.f52147p0;
                        if ((i10 & 4) == 4) {
                            i11 |= 4;
                        }
                        value.f52135q0 = this.f52148q0;
                        if ((i10 & 8) == 8) {
                            i11 |= 8;
                        }
                        value.f52136r0 = this.f52149r0;
                        if ((i10 & 16) == 16) {
                            i11 |= 16;
                        }
                        value.f52137s0 = this.f52150s0;
                        if ((i10 & 32) == 32) {
                            i11 |= 32;
                        }
                        value.f52138t0 = this.f52151t0;
                        if ((i10 & 64) == 64) {
                            i11 |= 64;
                        }
                        value.f52139u0 = this.f52152u0;
                        if ((i10 & 128) == 128) {
                            i11 |= 128;
                        }
                        value.f52140v0 = this.f52153v0;
                        if ((i10 & 256) == 256) {
                            this.f52154w0 = DesugarCollections.unmodifiableList(this.f52154w0);
                            this.f52145Z &= -257;
                        }
                        value.f52141w0 = this.f52154w0;
                        if ((i10 & 512) == 512) {
                            i11 |= 256;
                        }
                        value.f52142x0 = this.f52155x0;
                        if ((i10 & 1024) == 1024) {
                            i11 |= 512;
                        }
                        value.f52143y0 = this.f52156y0;
                        value.f52132Z = i11;
                        return value;
                    }

                    public Annotation getAnnotation() {
                        return this.f52153v0;
                    }

                    public Value getArrayElement(int i10) {
                        return (Value) this.f52154w0.get(i10);
                    }

                    public int getArrayElementCount() {
                        return this.f52154w0.size();
                    }

                    public boolean hasAnnotation() {
                        return (this.f52145Z & 128) == 128;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i10 = 0; i10 < getArrayElementCount(); i10++) {
                            if (!getArrayElement(i10).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeAnnotation(Annotation annotation) {
                        if ((this.f52145Z & 128) != 128 || this.f52153v0 == Annotation.getDefaultInstance()) {
                            this.f52153v0 = annotation;
                        } else {
                            this.f52153v0 = Annotation.newBuilder(this.f52153v0).mergeFrom(annotation).buildPartial();
                        }
                        this.f52145Z |= 128;
                        return this;
                    }

                    public Builder setArrayDimensionCount(int i10) {
                        this.f52145Z |= 512;
                        this.f52155x0 = i10;
                        return this;
                    }

                    public Builder setClassId(int i10) {
                        this.f52145Z |= 32;
                        this.f52151t0 = i10;
                        return this;
                    }

                    public Builder setDoubleValue(double d10) {
                        this.f52145Z |= 8;
                        this.f52149r0 = d10;
                        return this;
                    }

                    public Builder setEnumValueId(int i10) {
                        this.f52145Z |= 64;
                        this.f52152u0 = i10;
                        return this;
                    }

                    public Builder setFlags(int i10) {
                        this.f52145Z |= 1024;
                        this.f52156y0 = i10;
                        return this;
                    }

                    public Builder setFloatValue(float f10) {
                        this.f52145Z |= 4;
                        this.f52148q0 = f10;
                        return this;
                    }

                    public Builder setIntValue(long j10) {
                        this.f52145Z |= 2;
                        this.f52147p0 = j10;
                        return this;
                    }

                    public Builder setStringValue(int i10) {
                        this.f52145Z |= 16;
                        this.f52150s0 = i10;
                        return this;
                    }

                    public Builder setType(Type type) {
                        type.getClass();
                        this.f52145Z |= 1;
                        this.f52146o0 = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Value build() {
                        Value valueBuildPartial = buildPartial();
                        if (valueBuildPartial.isInitialized()) {
                            return valueBuildPartial;
                        }
                        throw new UninitializedMessageException(valueBuildPartial);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo22588clone() {
                        return new Builder().mergeFrom(buildPartial());
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public Builder mergeFrom(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.f52141w0.isEmpty()) {
                            if (this.f52154w0.isEmpty()) {
                                this.f52154w0 = value.f52141w0;
                                this.f52145Z &= -257;
                            } else {
                                if ((this.f52145Z & 256) != 256) {
                                    this.f52154w0 = new ArrayList(this.f52154w0);
                                    this.f52145Z |= 256;
                                }
                                this.f52154w0.addAll(value.f52141w0);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.f52131Y));
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                Value partialFrom = Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (partialFrom != null) {
                                    mergeFrom(partialFrom);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e10) {
                                Value value2 = (Value) e10.getUnfinishedMessage();
                                try {
                                    throw e10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    value = value2;
                                    if (value != null) {
                                        mergeFrom(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (value != null) {
                                mergeFrom(value);
                            }
                            throw th;
                        }
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);


                    /* JADX INFO: renamed from: Y */
                    public final int f52158Y;

                    Type(int i10) {
                        this.f52158Y = i10;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.f52158Y;
                    }

                    public static Type valueOf(int i10) {
                        switch (i10) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }
                }

                static {
                    Value value = new Value();
                    f52129B0 = value;
                    value.m18250a();
                }

                public Value() {
                    this.f52144z0 = (byte) -1;
                    this.f52130A0 = -1;
                    this.f52131Y = ByteString.EMPTY;
                }

                public static Value getDefaultInstance() {
                    return f52129B0;
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mergeFrom(value);
                }

                /* JADX INFO: renamed from: a */
                public final void m18250a() {
                    this.f52133o0 = Type.BYTE;
                    this.f52134p0 = 0L;
                    this.f52135q0 = 0.0f;
                    this.f52136r0 = 0.0d;
                    this.f52137s0 = 0;
                    this.f52138t0 = 0;
                    this.f52139u0 = 0;
                    this.f52140v0 = Annotation.getDefaultInstance();
                    this.f52141w0 = Collections.emptyList();
                    this.f52142x0 = 0;
                    this.f52143y0 = 0;
                }

                public Annotation getAnnotation() {
                    return this.f52140v0;
                }

                public int getArrayDimensionCount() {
                    return this.f52142x0;
                }

                public Value getArrayElement(int i10) {
                    return (Value) this.f52141w0.get(i10);
                }

                public int getArrayElementCount() {
                    return this.f52141w0.size();
                }

                public List<Value> getArrayElementList() {
                    return this.f52141w0;
                }

                public int getClassId() {
                    return this.f52138t0;
                }

                public double getDoubleValue() {
                    return this.f52136r0;
                }

                public int getEnumValueId() {
                    return this.f52139u0;
                }

                public int getFlags() {
                    return this.f52143y0;
                }

                public float getFloatValue() {
                    return this.f52135q0;
                }

                public long getIntValue() {
                    return this.f52134p0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> getParserForType() {
                    return PARSER;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.f52130A0;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeEnumSize = (this.f52132Z & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f52133o0.getNumber()) : 0;
                    if ((this.f52132Z & 2) == 2) {
                        iComputeEnumSize += CodedOutputStream.computeSInt64Size(2, this.f52134p0);
                    }
                    if ((this.f52132Z & 4) == 4) {
                        iComputeEnumSize += CodedOutputStream.computeFloatSize(3, this.f52135q0);
                    }
                    if ((this.f52132Z & 8) == 8) {
                        iComputeEnumSize += CodedOutputStream.computeDoubleSize(4, this.f52136r0);
                    }
                    if ((this.f52132Z & 16) == 16) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(5, this.f52137s0);
                    }
                    if ((this.f52132Z & 32) == 32) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, this.f52138t0);
                    }
                    if ((this.f52132Z & 64) == 64) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(7, this.f52139u0);
                    }
                    if ((this.f52132Z & 128) == 128) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(8, this.f52140v0);
                    }
                    for (int i11 = 0; i11 < this.f52141w0.size(); i11++) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f52141w0.get(i11));
                    }
                    if ((this.f52132Z & 512) == 512) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(10, this.f52143y0);
                    }
                    if ((this.f52132Z & 256) == 256) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(11, this.f52142x0);
                    }
                    int size = this.f52131Y.size() + iComputeEnumSize;
                    this.f52130A0 = size;
                    return size;
                }

                public int getStringValue() {
                    return this.f52137s0;
                }

                public Type getType() {
                    return this.f52133o0;
                }

                public boolean hasAnnotation() {
                    return (this.f52132Z & 128) == 128;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.f52132Z & 256) == 256;
                }

                public boolean hasClassId() {
                    return (this.f52132Z & 32) == 32;
                }

                public boolean hasDoubleValue() {
                    return (this.f52132Z & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.f52132Z & 64) == 64;
                }

                public boolean hasFlags() {
                    return (this.f52132Z & 512) == 512;
                }

                public boolean hasFloatValue() {
                    return (this.f52132Z & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.f52132Z & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.f52132Z & 16) == 16;
                }

                public boolean hasType() {
                    return (this.f52132Z & 1) == 1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b = this.f52144z0;
                    if (b == 1) {
                        return true;
                    }
                    if (b == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.f52144z0 = (byte) 0;
                        return false;
                    }
                    for (int i10 = 0; i10 < getArrayElementCount(); i10++) {
                        if (!getArrayElement(i10).isInitialized()) {
                            this.f52144z0 = (byte) 0;
                            return false;
                        }
                    }
                    this.f52144z0 = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    getSerializedSize();
                    if ((this.f52132Z & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.f52133o0.getNumber());
                    }
                    if ((this.f52132Z & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.f52134p0);
                    }
                    if ((this.f52132Z & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.f52135q0);
                    }
                    if ((this.f52132Z & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.f52136r0);
                    }
                    if ((this.f52132Z & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.f52137s0);
                    }
                    if ((this.f52132Z & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.f52138t0);
                    }
                    if ((this.f52132Z & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.f52139u0);
                    }
                    if ((this.f52132Z & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.f52140v0);
                    }
                    for (int i10 = 0; i10 < this.f52141w0.size(); i10++) {
                        codedOutputStream.writeMessage(9, (MessageLite) this.f52141w0.get(i10));
                    }
                    if ((this.f52132Z & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.f52143y0);
                    }
                    if ((this.f52132Z & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.f52142x0);
                    }
                    codedOutputStream.writeRawBytes(this.f52131Y);
                }

                public static Builder newBuilder() {
                    return new Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Value getDefaultInstanceForType() {
                    return f52129B0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder toBuilder() {
                    return newBuilder(this);
                }

                public Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    this.f52144z0 = (byte) -1;
                    this.f52130A0 = -1;
                    m18250a();
                    ByteString.Output outputNewOutput = ByteString.newOutput();
                    CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                    boolean z6 = false;
                    char c9 = 0;
                    while (!z6) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                switch (tag) {
                                    case 0:
                                        break;
                                    case 8:
                                        int i10 = codedInputStream.readEnum();
                                        Type typeValueOf = Type.valueOf(i10);
                                        if (typeValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i10);
                                        } else {
                                            this.f52132Z |= 1;
                                            this.f52133o0 = typeValueOf;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.f52132Z |= 2;
                                        this.f52134p0 = codedInputStream.readSInt64();
                                        continue;
                                    case 29:
                                        this.f52132Z |= 4;
                                        this.f52135q0 = codedInputStream.readFloat();
                                        continue;
                                    case 33:
                                        this.f52132Z |= 8;
                                        this.f52136r0 = codedInputStream.readDouble();
                                        continue;
                                    case 40:
                                        this.f52132Z |= 16;
                                        this.f52137s0 = codedInputStream.readInt32();
                                        continue;
                                    case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                        this.f52132Z |= 32;
                                        this.f52138t0 = codedInputStream.readInt32();
                                        continue;
                                    case 56:
                                        this.f52132Z |= 64;
                                        this.f52139u0 = codedInputStream.readInt32();
                                        continue;
                                    case 66:
                                        Builder builder = (this.f52132Z & 128) == 128 ? this.f52140v0.toBuilder() : null;
                                        Annotation annotation = (Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite);
                                        this.f52140v0 = annotation;
                                        if (builder != null) {
                                            builder.mergeFrom(annotation);
                                            this.f52140v0 = builder.buildPartial();
                                        }
                                        this.f52132Z |= 128;
                                        continue;
                                    case 74:
                                        if ((c9 & 256) != 256) {
                                            this.f52141w0 = new ArrayList();
                                            c9 = 256;
                                        }
                                        this.f52141w0.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                        continue;
                                    case 80:
                                        this.f52132Z |= 512;
                                        this.f52143y0 = codedInputStream.readInt32();
                                        continue;
                                    case 88:
                                        this.f52132Z |= 256;
                                        this.f52142x0 = codedInputStream.readInt32();
                                        continue;
                                    default:
                                        if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                            break;
                                        }
                                        break;
                                }
                                z6 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.setUnfinishedMessage(this);
                            } catch (IOException e11) {
                                throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                            }
                        } catch (Throwable th2) {
                            if ((c9 & 256) == 256) {
                                this.f52141w0 = DesugarCollections.unmodifiableList(this.f52141w0);
                            }
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } finally {
                                this.f52131Y = outputNewOutput.toByteString();
                            }
                            throw th2;
                        }
                    }
                    if ((c9 & 256) == 256) {
                        this.f52141w0 = DesugarCollections.unmodifiableList(this.f52141w0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused2) {
                    } finally {
                        this.f52131Y = outputNewOutput.toByteString();
                    }
                }

                public Value(Builder builder) {
                    this.f52144z0 = (byte) -1;
                    this.f52130A0 = -1;
                    this.f52131Y = builder.getUnknownFields();
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            static {
                Argument argument = new Argument();
                f52119s0 = argument;
                argument.f52122o0 = 0;
                argument.f52123p0 = Value.getDefaultInstance();
            }

            public Argument() {
                this.f52124q0 = (byte) -1;
                this.f52125r0 = -1;
                this.f52120Y = ByteString.EMPTY;
            }

            public static Argument getDefaultInstance() {
                return f52119s0;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            public int getNameId() {
                return this.f52122o0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.f52125r0;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeInt32Size = (this.f52121Z & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52122o0) : 0;
                if ((this.f52121Z & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.f52123p0);
                }
                int size = this.f52120Y.size() + iComputeInt32Size;
                this.f52125r0 = size;
                return size;
            }

            public Value getValue() {
                return this.f52123p0;
            }

            public boolean hasNameId() {
                return (this.f52121Z & 1) == 1;
            }

            public boolean hasValue() {
                return (this.f52121Z & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f52124q0;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.f52124q0 = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.f52124q0 = (byte) 0;
                    return false;
                }
                if (getValue().isInitialized()) {
                    this.f52124q0 = (byte) 1;
                    return true;
                }
                this.f52124q0 = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f52121Z & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f52122o0);
                }
                if ((this.f52121Z & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.f52123p0);
                }
                codedOutputStream.writeRawBytes(this.f52120Y);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return f52119s0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.f52124q0 = (byte) -1;
                this.f52125r0 = -1;
                boolean z6 = false;
                this.f52122o0 = 0;
                this.f52123p0 = Value.getDefaultInstance();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f52121Z |= 1;
                                    this.f52122o0 = codedInputStream.readInt32();
                                } else if (tag != 18) {
                                    if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    Value.Builder builder = (this.f52121Z & 2) == 2 ? this.f52123p0.toBuilder() : null;
                                    Value value = (Value) codedInputStream.readMessage(Value.PARSER, extensionRegistryLite);
                                    this.f52123p0 = value;
                                    if (builder != null) {
                                        builder.mergeFrom(value);
                                        this.f52123p0 = builder.buildPartial();
                                    }
                                    this.f52121Z |= 2;
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52120Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f52120Y = outputNewOutput.toByteString();
                }
            }

            public Argument(Builder builder) {
                this.f52124q0 = (byte) -1;
                this.f52125r0 = -1;
                this.f52120Y = builder.getUnknownFields();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52159Z;

            /* JADX INFO: renamed from: o0 */
            public int f52160o0;

            /* JADX INFO: renamed from: p0 */
            public List f52161p0 = Collections.emptyList();

            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                int i10 = this.f52159Z;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                annotation.f52115o0 = this.f52160o0;
                if ((i10 & 2) == 2) {
                    this.f52161p0 = DesugarCollections.unmodifiableList(this.f52161p0);
                    this.f52159Z &= -3;
                }
                annotation.f52116p0 = this.f52161p0;
                annotation.f52114Z = i11;
                return annotation;
            }

            public Argument getArgument(int i10) {
                return (Argument) this.f52161p0.get(i10);
            }

            public int getArgumentCount() {
                return this.f52161p0.size();
            }

            public boolean hasId() {
                return (this.f52159Z & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i10 = 0; i10 < getArgumentCount(); i10++) {
                    if (!getArgument(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setId(int i10) {
                this.f52159Z |= 1;
                this.f52160o0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Annotation build() {
                Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw new UninitializedMessageException(annotationBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.f52116p0.isEmpty()) {
                    if (this.f52161p0.isEmpty()) {
                        this.f52161p0 = annotation.f52116p0;
                        this.f52159Z &= -3;
                    } else {
                        if ((this.f52159Z & 2) != 2) {
                            this.f52161p0 = new ArrayList(this.f52161p0);
                            this.f52159Z |= 2;
                        }
                        this.f52161p0.addAll(annotation.f52116p0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.f52113Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        Annotation partialFrom = Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Annotation annotation2 = (Annotation) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            annotation = annotation2;
                            if (annotation != null) {
                                mergeFrom(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (annotation != null) {
                        mergeFrom(annotation);
                    }
                    throw th;
                }
            }
        }

        static {
            Annotation annotation = new Annotation();
            f52112s0 = annotation;
            annotation.f52115o0 = 0;
            annotation.f52116p0 = Collections.emptyList();
        }

        public Annotation() {
            this.f52117q0 = (byte) -1;
            this.f52118r0 = -1;
            this.f52113Y = ByteString.EMPTY;
        }

        public static Annotation getDefaultInstance() {
            return f52112s0;
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        public Argument getArgument(int i10) {
            return (Argument) this.f52116p0.get(i10);
        }

        public int getArgumentCount() {
            return this.f52116p0.size();
        }

        public List<Argument> getArgumentList() {
            return this.f52116p0;
        }

        public int getId() {
            return this.f52115o0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52118r0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52114Z & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52115o0) : 0;
            for (int i11 = 0; i11 < this.f52116p0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f52116p0.get(i11));
            }
            int size = this.f52113Y.size() + iComputeInt32Size;
            this.f52118r0 = size;
            return size;
        }

        public boolean hasId() {
            return (this.f52114Z & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52117q0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.f52117q0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getArgumentCount(); i10++) {
                if (!getArgument(i10).isInitialized()) {
                    this.f52117q0 = (byte) 0;
                    return false;
                }
            }
            this.f52117q0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f52114Z & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52115o0);
            }
            for (int i10 = 0; i10 < this.f52116p0.size(); i10++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f52116p0.get(i10));
            }
            codedOutputStream.writeRawBytes(this.f52113Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Annotation getDefaultInstanceForType() {
            return f52112s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52117q0 = (byte) -1;
            this.f52118r0 = -1;
            boolean z6 = false;
            this.f52115o0 = 0;
            this.f52116p0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            char c9 = 0;
            while (!z6) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f52114Z |= 1;
                                    this.f52115o0 = codedInputStream.readInt32();
                                } else if (tag != 18) {
                                    if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    if ((c9 & 2) != 2) {
                                        this.f52116p0 = new ArrayList();
                                        c9 = 2;
                                    }
                                    this.f52116p0.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
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
                    if ((c9 & 2) == 2) {
                        this.f52116p0 = DesugarCollections.unmodifiableList(this.f52116p0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52113Y = outputNewOutput.toByteString();
                    }
                    throw th2;
                }
            }
            if ((c9 & 2) == 2) {
                this.f52116p0 = DesugarCollections.unmodifiableList(this.f52116p0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52113Y = outputNewOutput.toByteString();
            }
        }

        public Annotation(Builder builder) {
            this.f52117q0 = (byte) -1;
            this.f52118r0 = -1;
            this.f52113Y = builder.getUnknownFields();
        }
    }

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static Parser<Class> PARSER = new C16577d();

        /* JADX INFO: renamed from: V0 */
        public static final Class f52162V0;

        /* JADX INFO: renamed from: A0 */
        public int f52163A0;

        /* JADX INFO: renamed from: B0 */
        public List f52164B0;

        /* JADX INFO: renamed from: C0 */
        public List f52165C0;

        /* JADX INFO: renamed from: D0 */
        public List f52166D0;

        /* JADX INFO: renamed from: E0 */
        public List f52167E0;

        /* JADX INFO: renamed from: F0 */
        public List f52168F0;

        /* JADX INFO: renamed from: G0 */
        public List f52169G0;

        /* JADX INFO: renamed from: H0 */
        public int f52170H0;

        /* JADX INFO: renamed from: I0 */
        public int f52171I0;

        /* JADX INFO: renamed from: J0 */
        public Type f52172J0;

        /* JADX INFO: renamed from: K0 */
        public int f52173K0;

        /* JADX INFO: renamed from: L0 */
        public List f52174L0;

        /* JADX INFO: renamed from: M0 */
        public int f52175M0;

        /* JADX INFO: renamed from: N0 */
        public List f52176N0;

        /* JADX INFO: renamed from: O0 */
        public List f52177O0;

        /* JADX INFO: renamed from: P0 */
        public int f52178P0;

        /* JADX INFO: renamed from: Q0 */
        public TypeTable f52179Q0;

        /* JADX INFO: renamed from: R0 */
        public List f52180R0;

        /* JADX INFO: renamed from: S0 */
        public VersionRequirementTable f52181S0;

        /* JADX INFO: renamed from: T0 */
        public byte f52182T0;

        /* JADX INFO: renamed from: U0 */
        public int f52183U0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52184Z;

        /* JADX INFO: renamed from: o0 */
        public int f52185o0;

        /* JADX INFO: renamed from: p0 */
        public int f52186p0;

        /* JADX INFO: renamed from: q0 */
        public int f52187q0;

        /* JADX INFO: renamed from: r0 */
        public int f52188r0;

        /* JADX INFO: renamed from: s0 */
        public List f52189s0;

        /* JADX INFO: renamed from: t0 */
        public List f52190t0;

        /* JADX INFO: renamed from: u0 */
        public List f52191u0;

        /* JADX INFO: renamed from: v0 */
        public int f52192v0;

        /* JADX INFO: renamed from: w0 */
        public List f52193w0;

        /* JADX INFO: renamed from: x0 */
        public int f52194x0;

        /* JADX INFO: renamed from: y0 */
        public List f52195y0;

        /* JADX INFO: renamed from: z0 */
        public List f52196z0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {

            /* JADX INFO: renamed from: F0 */
            public int f52202F0;

            /* JADX INFO: renamed from: H0 */
            public int f52204H0;

            /* JADX INFO: renamed from: p0 */
            public int f52211p0;

            /* JADX INFO: renamed from: r0 */
            public int f52213r0;

            /* JADX INFO: renamed from: s0 */
            public int f52214s0;

            /* JADX INFO: renamed from: q0 */
            public int f52212q0 = 6;

            /* JADX INFO: renamed from: t0 */
            public List f52215t0 = Collections.emptyList();

            /* JADX INFO: renamed from: u0 */
            public List f52216u0 = Collections.emptyList();

            /* JADX INFO: renamed from: v0 */
            public List f52217v0 = Collections.emptyList();

            /* JADX INFO: renamed from: w0 */
            public List f52218w0 = Collections.emptyList();

            /* JADX INFO: renamed from: x0 */
            public List f52219x0 = Collections.emptyList();

            /* JADX INFO: renamed from: y0 */
            public List f52220y0 = Collections.emptyList();

            /* JADX INFO: renamed from: z0 */
            public List f52221z0 = Collections.emptyList();

            /* JADX INFO: renamed from: A0 */
            public List f52197A0 = Collections.emptyList();

            /* JADX INFO: renamed from: B0 */
            public List f52198B0 = Collections.emptyList();

            /* JADX INFO: renamed from: C0 */
            public List f52199C0 = Collections.emptyList();

            /* JADX INFO: renamed from: D0 */
            public List f52200D0 = Collections.emptyList();

            /* JADX INFO: renamed from: E0 */
            public List f52201E0 = Collections.emptyList();

            /* JADX INFO: renamed from: G0 */
            public Type f52203G0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: I0 */
            public List f52205I0 = Collections.emptyList();

            /* JADX INFO: renamed from: J0 */
            public List f52206J0 = Collections.emptyList();

            /* JADX INFO: renamed from: K0 */
            public List f52207K0 = Collections.emptyList();

            /* JADX INFO: renamed from: L0 */
            public TypeTable f52208L0 = TypeTable.getDefaultInstance();

            /* JADX INFO: renamed from: M0 */
            public List f52209M0 = Collections.emptyList();

            /* JADX INFO: renamed from: N0 */
            public VersionRequirementTable f52210N0 = VersionRequirementTable.getDefaultInstance();

            public Class buildPartial() {
                Class r6 = new Class(this);
                int i10 = this.f52211p0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                r6.f52186p0 = this.f52212q0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                r6.f52187q0 = this.f52213r0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                r6.f52188r0 = this.f52214s0;
                if ((i10 & 8) == 8) {
                    this.f52215t0 = DesugarCollections.unmodifiableList(this.f52215t0);
                    this.f52211p0 &= -9;
                }
                r6.f52189s0 = this.f52215t0;
                if ((this.f52211p0 & 16) == 16) {
                    this.f52216u0 = DesugarCollections.unmodifiableList(this.f52216u0);
                    this.f52211p0 &= -17;
                }
                r6.f52190t0 = this.f52216u0;
                if ((this.f52211p0 & 32) == 32) {
                    this.f52217v0 = DesugarCollections.unmodifiableList(this.f52217v0);
                    this.f52211p0 &= -33;
                }
                r6.f52191u0 = this.f52217v0;
                if ((this.f52211p0 & 64) == 64) {
                    this.f52218w0 = DesugarCollections.unmodifiableList(this.f52218w0);
                    this.f52211p0 &= -65;
                }
                r6.f52193w0 = this.f52218w0;
                if ((this.f52211p0 & 128) == 128) {
                    this.f52219x0 = DesugarCollections.unmodifiableList(this.f52219x0);
                    this.f52211p0 &= -129;
                }
                r6.f52195y0 = this.f52219x0;
                if ((this.f52211p0 & 256) == 256) {
                    this.f52220y0 = DesugarCollections.unmodifiableList(this.f52220y0);
                    this.f52211p0 &= -257;
                }
                r6.f52196z0 = this.f52220y0;
                if ((this.f52211p0 & 512) == 512) {
                    this.f52221z0 = DesugarCollections.unmodifiableList(this.f52221z0);
                    this.f52211p0 &= -513;
                }
                r6.f52164B0 = this.f52221z0;
                if ((this.f52211p0 & 1024) == 1024) {
                    this.f52197A0 = DesugarCollections.unmodifiableList(this.f52197A0);
                    this.f52211p0 &= -1025;
                }
                r6.f52165C0 = this.f52197A0;
                if ((this.f52211p0 & 2048) == 2048) {
                    this.f52198B0 = DesugarCollections.unmodifiableList(this.f52198B0);
                    this.f52211p0 &= -2049;
                }
                r6.f52166D0 = this.f52198B0;
                if ((this.f52211p0 & 4096) == 4096) {
                    this.f52199C0 = DesugarCollections.unmodifiableList(this.f52199C0);
                    this.f52211p0 &= -4097;
                }
                r6.f52167E0 = this.f52199C0;
                if ((this.f52211p0 & 8192) == 8192) {
                    this.f52200D0 = DesugarCollections.unmodifiableList(this.f52200D0);
                    this.f52211p0 &= -8193;
                }
                r6.f52168F0 = this.f52200D0;
                if ((this.f52211p0 & 16384) == 16384) {
                    this.f52201E0 = DesugarCollections.unmodifiableList(this.f52201E0);
                    this.f52211p0 &= -16385;
                }
                r6.f52169G0 = this.f52201E0;
                if ((i10 & 32768) == 32768) {
                    i11 |= 8;
                }
                r6.f52171I0 = this.f52202F0;
                if ((i10 & 65536) == 65536) {
                    i11 |= 16;
                }
                r6.f52172J0 = this.f52203G0;
                if ((i10 & 131072) == 131072) {
                    i11 |= 32;
                }
                r6.f52173K0 = this.f52204H0;
                if ((this.f52211p0 & 262144) == 262144) {
                    this.f52205I0 = DesugarCollections.unmodifiableList(this.f52205I0);
                    this.f52211p0 &= -262145;
                }
                r6.f52174L0 = this.f52205I0;
                if ((this.f52211p0 & 524288) == 524288) {
                    this.f52206J0 = DesugarCollections.unmodifiableList(this.f52206J0);
                    this.f52211p0 &= -524289;
                }
                r6.f52176N0 = this.f52206J0;
                if ((this.f52211p0 & 1048576) == 1048576) {
                    this.f52207K0 = DesugarCollections.unmodifiableList(this.f52207K0);
                    this.f52211p0 &= -1048577;
                }
                r6.f52177O0 = this.f52207K0;
                if ((i10 & 2097152) == 2097152) {
                    i11 |= 64;
                }
                r6.f52179Q0 = this.f52208L0;
                if ((this.f52211p0 & 4194304) == 4194304) {
                    this.f52209M0 = DesugarCollections.unmodifiableList(this.f52209M0);
                    this.f52211p0 &= -4194305;
                }
                r6.f52180R0 = this.f52209M0;
                if ((i10 & 8388608) == 8388608) {
                    i11 |= 128;
                }
                r6.f52181S0 = this.f52210N0;
                r6.f52185o0 = i11;
                return r6;
            }

            public Constructor getConstructor(int i10) {
                return (Constructor) this.f52221z0.get(i10);
            }

            public int getConstructorCount() {
                return this.f52221z0.size();
            }

            public Type getContextReceiverType(int i10) {
                return (Type) this.f52219x0.get(i10);
            }

            public int getContextReceiverTypeCount() {
                return this.f52219x0.size();
            }

            public EnumEntry getEnumEntry(int i10) {
                return (EnumEntry) this.f52200D0.get(i10);
            }

            public int getEnumEntryCount() {
                return this.f52200D0.size();
            }

            public Function getFunction(int i10) {
                return (Function) this.f52197A0.get(i10);
            }

            public int getFunctionCount() {
                return this.f52197A0.size();
            }

            public Type getInlineClassUnderlyingType() {
                return this.f52203G0;
            }

            public Type getMultiFieldValueClassUnderlyingType(int i10) {
                return (Type) this.f52206J0.get(i10);
            }

            public int getMultiFieldValueClassUnderlyingTypeCount() {
                return this.f52206J0.size();
            }

            public Property getProperty(int i10) {
                return (Property) this.f52198B0.get(i10);
            }

            public int getPropertyCount() {
                return this.f52198B0.size();
            }

            public Type getSupertype(int i10) {
                return (Type) this.f52216u0.get(i10);
            }

            public int getSupertypeCount() {
                return this.f52216u0.size();
            }

            public TypeAlias getTypeAlias(int i10) {
                return (TypeAlias) this.f52199C0.get(i10);
            }

            public int getTypeAliasCount() {
                return this.f52199C0.size();
            }

            public TypeParameter getTypeParameter(int i10) {
                return (TypeParameter) this.f52215t0.get(i10);
            }

            public int getTypeParameterCount() {
                return this.f52215t0.size();
            }

            public TypeTable getTypeTable() {
                return this.f52208L0;
            }

            public boolean hasFqName() {
                return (this.f52211p0 & 2) == 2;
            }

            public boolean hasInlineClassUnderlyingType() {
                return (this.f52211p0 & 65536) == 65536;
            }

            public boolean hasTypeTable() {
                return (this.f52211p0 & 2097152) == 2097152;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                    if (!getTypeParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < getSupertypeCount(); i11++) {
                    if (!getSupertype(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                    if (!getContextReceiverType(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getConstructorCount(); i13++) {
                    if (!getConstructor(i13).isInitialized()) {
                        return false;
                    }
                }
                for (int i14 = 0; i14 < getFunctionCount(); i14++) {
                    if (!getFunction(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < getPropertyCount(); i15++) {
                    if (!getProperty(i15).isInitialized()) {
                        return false;
                    }
                }
                for (int i16 = 0; i16 < getTypeAliasCount(); i16++) {
                    if (!getTypeAlias(i16).isInitialized()) {
                        return false;
                    }
                }
                for (int i17 = 0; i17 < getEnumEntryCount(); i17++) {
                    if (!getEnumEntry(i17).isInitialized()) {
                        return false;
                    }
                }
                if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                    return false;
                }
                for (int i18 = 0; i18 < getMultiFieldValueClassUnderlyingTypeCount(); i18++) {
                    if (!getMultiFieldValueClassUnderlyingType(i18).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && this.f52733Z.m18301f();
            }

            public Builder mergeInlineClassUnderlyingType(Type type) {
                if ((this.f52211p0 & 65536) != 65536 || this.f52203G0 == Type.getDefaultInstance()) {
                    this.f52203G0 = type;
                } else {
                    this.f52203G0 = Type.newBuilder(this.f52203G0).mergeFrom(type).buildPartial();
                }
                this.f52211p0 |= 65536;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.f52211p0 & 2097152) != 2097152 || this.f52208L0 == TypeTable.getDefaultInstance()) {
                    this.f52208L0 = typeTable;
                } else {
                    this.f52208L0 = TypeTable.newBuilder(this.f52208L0).mergeFrom(typeTable).buildPartial();
                }
                this.f52211p0 |= 2097152;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.f52211p0 & 8388608) != 8388608 || this.f52210N0 == VersionRequirementTable.getDefaultInstance()) {
                    this.f52210N0 = versionRequirementTable;
                } else {
                    this.f52210N0 = VersionRequirementTable.newBuilder(this.f52210N0).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.f52211p0 |= 8388608;
                return this;
            }

            public Builder setCompanionObjectName(int i10) {
                this.f52211p0 |= 4;
                this.f52214s0 = i10;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f52211p0 |= 1;
                this.f52212q0 = i10;
                return this;
            }

            public Builder setFqName(int i10) {
                this.f52211p0 |= 2;
                this.f52213r0 = i10;
                return this;
            }

            public Builder setInlineClassUnderlyingPropertyName(int i10) {
                this.f52211p0 |= 32768;
                this.f52202F0 = i10;
                return this;
            }

            public Builder setInlineClassUnderlyingTypeId(int i10) {
                this.f52211p0 |= 131072;
                this.f52204H0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Class build() {
                Class classBuildPartial = buildPartial();
                if (classBuildPartial.isInitialized()) {
                    return classBuildPartial;
                }
                throw new UninitializedMessageException(classBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Class r6) {
                if (r6 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r6.hasFlags()) {
                    setFlags(r6.getFlags());
                }
                if (r6.hasFqName()) {
                    setFqName(r6.getFqName());
                }
                if (r6.hasCompanionObjectName()) {
                    setCompanionObjectName(r6.getCompanionObjectName());
                }
                if (!r6.f52189s0.isEmpty()) {
                    if (this.f52215t0.isEmpty()) {
                        this.f52215t0 = r6.f52189s0;
                        this.f52211p0 &= -9;
                    } else {
                        if ((this.f52211p0 & 8) != 8) {
                            this.f52215t0 = new ArrayList(this.f52215t0);
                            this.f52211p0 |= 8;
                        }
                        this.f52215t0.addAll(r6.f52189s0);
                    }
                }
                if (!r6.f52190t0.isEmpty()) {
                    if (this.f52216u0.isEmpty()) {
                        this.f52216u0 = r6.f52190t0;
                        this.f52211p0 &= -17;
                    } else {
                        if ((this.f52211p0 & 16) != 16) {
                            this.f52216u0 = new ArrayList(this.f52216u0);
                            this.f52211p0 |= 16;
                        }
                        this.f52216u0.addAll(r6.f52190t0);
                    }
                }
                if (!r6.f52191u0.isEmpty()) {
                    if (this.f52217v0.isEmpty()) {
                        this.f52217v0 = r6.f52191u0;
                        this.f52211p0 &= -33;
                    } else {
                        if ((this.f52211p0 & 32) != 32) {
                            this.f52217v0 = new ArrayList(this.f52217v0);
                            this.f52211p0 |= 32;
                        }
                        this.f52217v0.addAll(r6.f52191u0);
                    }
                }
                if (!r6.f52193w0.isEmpty()) {
                    if (this.f52218w0.isEmpty()) {
                        this.f52218w0 = r6.f52193w0;
                        this.f52211p0 &= -65;
                    } else {
                        if ((this.f52211p0 & 64) != 64) {
                            this.f52218w0 = new ArrayList(this.f52218w0);
                            this.f52211p0 |= 64;
                        }
                        this.f52218w0.addAll(r6.f52193w0);
                    }
                }
                if (!r6.f52195y0.isEmpty()) {
                    if (this.f52219x0.isEmpty()) {
                        this.f52219x0 = r6.f52195y0;
                        this.f52211p0 &= -129;
                    } else {
                        if ((this.f52211p0 & 128) != 128) {
                            this.f52219x0 = new ArrayList(this.f52219x0);
                            this.f52211p0 |= 128;
                        }
                        this.f52219x0.addAll(r6.f52195y0);
                    }
                }
                if (!r6.f52196z0.isEmpty()) {
                    if (this.f52220y0.isEmpty()) {
                        this.f52220y0 = r6.f52196z0;
                        this.f52211p0 &= -257;
                    } else {
                        if ((this.f52211p0 & 256) != 256) {
                            this.f52220y0 = new ArrayList(this.f52220y0);
                            this.f52211p0 |= 256;
                        }
                        this.f52220y0.addAll(r6.f52196z0);
                    }
                }
                if (!r6.f52164B0.isEmpty()) {
                    if (this.f52221z0.isEmpty()) {
                        this.f52221z0 = r6.f52164B0;
                        this.f52211p0 &= -513;
                    } else {
                        if ((this.f52211p0 & 512) != 512) {
                            this.f52221z0 = new ArrayList(this.f52221z0);
                            this.f52211p0 |= 512;
                        }
                        this.f52221z0.addAll(r6.f52164B0);
                    }
                }
                if (!r6.f52165C0.isEmpty()) {
                    if (this.f52197A0.isEmpty()) {
                        this.f52197A0 = r6.f52165C0;
                        this.f52211p0 &= -1025;
                    } else {
                        if ((this.f52211p0 & 1024) != 1024) {
                            this.f52197A0 = new ArrayList(this.f52197A0);
                            this.f52211p0 |= 1024;
                        }
                        this.f52197A0.addAll(r6.f52165C0);
                    }
                }
                if (!r6.f52166D0.isEmpty()) {
                    if (this.f52198B0.isEmpty()) {
                        this.f52198B0 = r6.f52166D0;
                        this.f52211p0 &= -2049;
                    } else {
                        if ((this.f52211p0 & 2048) != 2048) {
                            this.f52198B0 = new ArrayList(this.f52198B0);
                            this.f52211p0 |= 2048;
                        }
                        this.f52198B0.addAll(r6.f52166D0);
                    }
                }
                if (!r6.f52167E0.isEmpty()) {
                    if (this.f52199C0.isEmpty()) {
                        this.f52199C0 = r6.f52167E0;
                        this.f52211p0 &= -4097;
                    } else {
                        if ((this.f52211p0 & 4096) != 4096) {
                            this.f52199C0 = new ArrayList(this.f52199C0);
                            this.f52211p0 |= 4096;
                        }
                        this.f52199C0.addAll(r6.f52167E0);
                    }
                }
                if (!r6.f52168F0.isEmpty()) {
                    if (this.f52200D0.isEmpty()) {
                        this.f52200D0 = r6.f52168F0;
                        this.f52211p0 &= -8193;
                    } else {
                        if ((this.f52211p0 & 8192) != 8192) {
                            this.f52200D0 = new ArrayList(this.f52200D0);
                            this.f52211p0 |= 8192;
                        }
                        this.f52200D0.addAll(r6.f52168F0);
                    }
                }
                if (!r6.f52169G0.isEmpty()) {
                    if (this.f52201E0.isEmpty()) {
                        this.f52201E0 = r6.f52169G0;
                        this.f52211p0 &= -16385;
                    } else {
                        if ((this.f52211p0 & 16384) != 16384) {
                            this.f52201E0 = new ArrayList(this.f52201E0);
                            this.f52211p0 |= 16384;
                        }
                        this.f52201E0.addAll(r6.f52169G0);
                    }
                }
                if (r6.hasInlineClassUnderlyingPropertyName()) {
                    setInlineClassUnderlyingPropertyName(r6.getInlineClassUnderlyingPropertyName());
                }
                if (r6.hasInlineClassUnderlyingType()) {
                    mergeInlineClassUnderlyingType(r6.getInlineClassUnderlyingType());
                }
                if (r6.hasInlineClassUnderlyingTypeId()) {
                    setInlineClassUnderlyingTypeId(r6.getInlineClassUnderlyingTypeId());
                }
                if (!r6.f52174L0.isEmpty()) {
                    if (this.f52205I0.isEmpty()) {
                        this.f52205I0 = r6.f52174L0;
                        this.f52211p0 &= -262145;
                    } else {
                        if ((this.f52211p0 & 262144) != 262144) {
                            this.f52205I0 = new ArrayList(this.f52205I0);
                            this.f52211p0 |= 262144;
                        }
                        this.f52205I0.addAll(r6.f52174L0);
                    }
                }
                if (!r6.f52176N0.isEmpty()) {
                    if (this.f52206J0.isEmpty()) {
                        this.f52206J0 = r6.f52176N0;
                        this.f52211p0 &= -524289;
                    } else {
                        if ((this.f52211p0 & 524288) != 524288) {
                            this.f52206J0 = new ArrayList(this.f52206J0);
                            this.f52211p0 |= 524288;
                        }
                        this.f52206J0.addAll(r6.f52176N0);
                    }
                }
                if (!r6.f52177O0.isEmpty()) {
                    if (this.f52207K0.isEmpty()) {
                        this.f52207K0 = r6.f52177O0;
                        this.f52211p0 &= -1048577;
                    } else {
                        if ((this.f52211p0 & 1048576) != 1048576) {
                            this.f52207K0 = new ArrayList(this.f52207K0);
                            this.f52211p0 |= 1048576;
                        }
                        this.f52207K0.addAll(r6.f52177O0);
                    }
                }
                if (r6.hasTypeTable()) {
                    mergeTypeTable(r6.getTypeTable());
                }
                if (!r6.f52180R0.isEmpty()) {
                    if (this.f52209M0.isEmpty()) {
                        this.f52209M0 = r6.f52180R0;
                        this.f52211p0 &= -4194305;
                    } else {
                        if ((this.f52211p0 & 4194304) != 4194304) {
                            this.f52209M0 = new ArrayList(this.f52209M0);
                            this.f52211p0 |= 4194304;
                        }
                        this.f52209M0.addAll(r6.f52180R0);
                    }
                }
                if (r6.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r6.getVersionRequirementTable());
                }
                m18283a(r6);
                setUnknownFields(getUnknownFields().concat(r6.f52184Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Class r6 = null;
                try {
                    try {
                        Class partialFrom = Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Class r10 = (Class) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            r6 = r10;
                            if (r6 != null) {
                                mergeFrom(r6);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r6 != null) {
                        mergeFrom(r6);
                    }
                    throw th;
                }
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            OBJECT(5),
            COMPANION_OBJECT(6);


            /* JADX INFO: renamed from: Y */
            public final int f52223Y;

            Kind(int i10) {
                this.f52223Y = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f52223Y;
            }

            public static Kind valueOf(int i10) {
                switch (i10) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }
        }

        static {
            Class r6 = new Class();
            f52162V0 = r6;
            r6.m18251e();
        }

        public Class(Builder builder) {
            super(builder);
            this.f52192v0 = -1;
            this.f52194x0 = -1;
            this.f52163A0 = -1;
            this.f52170H0 = -1;
            this.f52175M0 = -1;
            this.f52178P0 = -1;
            this.f52182T0 = (byte) -1;
            this.f52183U0 = -1;
            this.f52184Z = builder.getUnknownFields();
        }

        public static Class getDefaultInstance() {
            return f52162V0;
        }

        public static Builder newBuilder(Class r6) {
            return newBuilder().mergeFrom(r6);
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        /* JADX INFO: renamed from: e */
        public final void m18251e() {
            this.f52186p0 = 6;
            this.f52187q0 = 0;
            this.f52188r0 = 0;
            this.f52189s0 = Collections.emptyList();
            this.f52190t0 = Collections.emptyList();
            this.f52191u0 = Collections.emptyList();
            this.f52193w0 = Collections.emptyList();
            this.f52195y0 = Collections.emptyList();
            this.f52196z0 = Collections.emptyList();
            this.f52164B0 = Collections.emptyList();
            this.f52165C0 = Collections.emptyList();
            this.f52166D0 = Collections.emptyList();
            this.f52167E0 = Collections.emptyList();
            this.f52168F0 = Collections.emptyList();
            this.f52169G0 = Collections.emptyList();
            this.f52171I0 = 0;
            this.f52172J0 = Type.getDefaultInstance();
            this.f52173K0 = 0;
            this.f52174L0 = Collections.emptyList();
            this.f52176N0 = Collections.emptyList();
            this.f52177O0 = Collections.emptyList();
            this.f52179Q0 = TypeTable.getDefaultInstance();
            this.f52180R0 = Collections.emptyList();
            this.f52181S0 = VersionRequirementTable.getDefaultInstance();
        }

        public int getCompanionObjectName() {
            return this.f52188r0;
        }

        public Constructor getConstructor(int i10) {
            return (Constructor) this.f52164B0.get(i10);
        }

        public int getConstructorCount() {
            return this.f52164B0.size();
        }

        public List<Constructor> getConstructorList() {
            return this.f52164B0;
        }

        public Type getContextReceiverType(int i10) {
            return (Type) this.f52195y0.get(i10);
        }

        public int getContextReceiverTypeCount() {
            return this.f52195y0.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.f52196z0;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.f52195y0;
        }

        public EnumEntry getEnumEntry(int i10) {
            return (EnumEntry) this.f52168F0.get(i10);
        }

        public int getEnumEntryCount() {
            return this.f52168F0.size();
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.f52168F0;
        }

        public int getFlags() {
            return this.f52186p0;
        }

        public int getFqName() {
            return this.f52187q0;
        }

        public Function getFunction(int i10) {
            return (Function) this.f52165C0.get(i10);
        }

        public int getFunctionCount() {
            return this.f52165C0.size();
        }

        public List<Function> getFunctionList() {
            return this.f52165C0;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.f52171I0;
        }

        public Type getInlineClassUnderlyingType() {
            return this.f52172J0;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.f52173K0;
        }

        public int getMultiFieldValueClassUnderlyingNameCount() {
            return this.f52174L0.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingNameList() {
            return this.f52174L0;
        }

        public Type getMultiFieldValueClassUnderlyingType(int i10) {
            return (Type) this.f52176N0.get(i10);
        }

        public int getMultiFieldValueClassUnderlyingTypeCount() {
            return this.f52176N0.size();
        }

        public int getMultiFieldValueClassUnderlyingTypeIdCount() {
            return this.f52177O0.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingTypeIdList() {
            return this.f52177O0;
        }

        public List<Type> getMultiFieldValueClassUnderlyingTypeList() {
            return this.f52176N0;
        }

        public List<Integer> getNestedClassNameList() {
            return this.f52193w0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i10) {
            return (Property) this.f52166D0.get(i10);
        }

        public int getPropertyCount() {
            return this.f52166D0.size();
        }

        public List<Property> getPropertyList() {
            return this.f52166D0;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.f52169G0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52183U0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52185o0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52186p0) : 0;
            int iComputeInt32SizeNoTag = 0;
            for (int i11 = 0; i11 < this.f52191u0.size(); i11++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52191u0.get(i11)).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getSupertypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f52192v0 = iComputeInt32SizeNoTag;
            if ((this.f52185o0 & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(3, this.f52187q0);
            }
            if ((this.f52185o0 & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(4, this.f52188r0);
            }
            for (int i12 = 0; i12 < this.f52189s0.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f52189s0.get(i12));
            }
            for (int i13 = 0; i13 < this.f52190t0.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f52190t0.get(i13));
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i14 = 0; i14 < this.f52193w0.size(); i14++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52193w0.get(i14)).intValue());
            }
            int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2;
            if (!getNestedClassNameList().isEmpty()) {
                iComputeMessageSize2 = iComputeMessageSize2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag2);
            }
            this.f52194x0 = iComputeInt32SizeNoTag2;
            for (int i15 = 0; i15 < this.f52164B0.size(); i15++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(8, (MessageLite) this.f52164B0.get(i15));
            }
            for (int i16 = 0; i16 < this.f52165C0.size(); i16++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(9, (MessageLite) this.f52165C0.get(i16));
            }
            for (int i17 = 0; i17 < this.f52166D0.size(); i17++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(10, (MessageLite) this.f52166D0.get(i17));
            }
            for (int i18 = 0; i18 < this.f52167E0.size(); i18++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(11, (MessageLite) this.f52167E0.get(i18));
            }
            for (int i19 = 0; i19 < this.f52168F0.size(); i19++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(13, (MessageLite) this.f52168F0.get(i19));
            }
            int iComputeInt32SizeNoTag3 = 0;
            for (int i20 = 0; i20 < this.f52169G0.size(); i20++) {
                iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52169G0.get(i20)).intValue());
            }
            int iComputeMessageSize3 = iComputeMessageSize2 + iComputeInt32SizeNoTag3;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                iComputeMessageSize3 = iComputeMessageSize3 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
            }
            this.f52170H0 = iComputeInt32SizeNoTag3;
            if ((this.f52185o0 & 8) == 8) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(17, this.f52171I0);
            }
            if ((this.f52185o0 & 16) == 16) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(18, this.f52172J0);
            }
            if ((this.f52185o0 & 32) == 32) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(19, this.f52173K0);
            }
            for (int i21 = 0; i21 < this.f52195y0.size(); i21++) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(20, (MessageLite) this.f52195y0.get(i21));
            }
            int iComputeInt32SizeNoTag4 = 0;
            for (int i22 = 0; i22 < this.f52196z0.size(); i22++) {
                iComputeInt32SizeNoTag4 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52196z0.get(i22)).intValue());
            }
            int iComputeInt32SizeNoTag5 = iComputeMessageSize3 + iComputeInt32SizeNoTag4;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeInt32SizeNoTag5 = iComputeInt32SizeNoTag5 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag4);
            }
            this.f52163A0 = iComputeInt32SizeNoTag4;
            int iComputeInt32SizeNoTag6 = 0;
            for (int i23 = 0; i23 < this.f52174L0.size(); i23++) {
                iComputeInt32SizeNoTag6 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52174L0.get(i23)).intValue());
            }
            int iComputeMessageSize4 = iComputeInt32SizeNoTag5 + iComputeInt32SizeNoTag6;
            if (!getMultiFieldValueClassUnderlyingNameList().isEmpty()) {
                iComputeMessageSize4 = iComputeMessageSize4 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag6);
            }
            this.f52175M0 = iComputeInt32SizeNoTag6;
            for (int i24 = 0; i24 < this.f52176N0.size(); i24++) {
                iComputeMessageSize4 += CodedOutputStream.computeMessageSize(23, (MessageLite) this.f52176N0.get(i24));
            }
            int iComputeInt32SizeNoTag7 = 0;
            for (int i25 = 0; i25 < this.f52177O0.size(); i25++) {
                iComputeInt32SizeNoTag7 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52177O0.get(i25)).intValue());
            }
            int iComputeMessageSize5 = iComputeMessageSize4 + iComputeInt32SizeNoTag7;
            if (!getMultiFieldValueClassUnderlyingTypeIdList().isEmpty()) {
                iComputeMessageSize5 = iComputeMessageSize5 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag7);
            }
            this.f52178P0 = iComputeInt32SizeNoTag7;
            if ((this.f52185o0 & 64) == 64) {
                iComputeMessageSize5 += CodedOutputStream.computeMessageSize(30, this.f52179Q0);
            }
            int iComputeInt32SizeNoTag8 = 0;
            for (int i26 = 0; i26 < this.f52180R0.size(); i26++) {
                iComputeInt32SizeNoTag8 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52180R0.get(i26)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + iComputeMessageSize5 + iComputeInt32SizeNoTag8;
            if ((this.f52185o0 & 128) == 128) {
                size += CodedOutputStream.computeMessageSize(32, this.f52181S0);
            }
            int size2 = this.f52184Z.size() + m18284a() + size;
            this.f52183U0 = size2;
            return size2;
        }

        public Type getSupertype(int i10) {
            return (Type) this.f52190t0.get(i10);
        }

        public int getSupertypeCount() {
            return this.f52190t0.size();
        }

        public List<Integer> getSupertypeIdList() {
            return this.f52191u0;
        }

        public List<Type> getSupertypeList() {
            return this.f52190t0;
        }

        public TypeAlias getTypeAlias(int i10) {
            return (TypeAlias) this.f52167E0.get(i10);
        }

        public int getTypeAliasCount() {
            return this.f52167E0.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.f52167E0;
        }

        public TypeParameter getTypeParameter(int i10) {
            return (TypeParameter) this.f52189s0.get(i10);
        }

        public int getTypeParameterCount() {
            return this.f52189s0.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f52189s0;
        }

        public TypeTable getTypeTable() {
            return this.f52179Q0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f52180R0;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.f52181S0;
        }

        public boolean hasCompanionObjectName() {
            return (this.f52185o0 & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.f52185o0 & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.f52185o0 & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.f52185o0 & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.f52185o0 & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.f52185o0 & 32) == 32;
        }

        public boolean hasTypeTable() {
            return (this.f52185o0 & 64) == 64;
        }

        public boolean hasVersionRequirementTable() {
            return (this.f52185o0 & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52182T0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.f52182T0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                if (!getTypeParameter(i10).isInitialized()) {
                    this.f52182T0 = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < getSupertypeCount(); i11++) {
                if (!getSupertype(i11).isInitialized()) {
                    this.f52182T0 = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                if (!getContextReceiverType(i12).isInitialized()) {
                    this.f52182T0 = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getConstructorCount(); i13++) {
                if (!getConstructor(i13).isInitialized()) {
                    this.f52182T0 = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < getFunctionCount(); i14++) {
                if (!getFunction(i14).isInitialized()) {
                    this.f52182T0 = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getPropertyCount(); i15++) {
                if (!getProperty(i15).isInitialized()) {
                    this.f52182T0 = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < getTypeAliasCount(); i16++) {
                if (!getTypeAlias(i16).isInitialized()) {
                    this.f52182T0 = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < getEnumEntryCount(); i17++) {
                if (!getEnumEntry(i17).isInitialized()) {
                    this.f52182T0 = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.f52182T0 = (byte) 0;
                return false;
            }
            for (int i18 = 0; i18 < getMultiFieldValueClassUnderlyingTypeCount(); i18++) {
                if (!getMultiFieldValueClassUnderlyingType(i18).isInitialized()) {
                    this.f52182T0 = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.f52182T0 = (byte) 0;
                return false;
            }
            if (this.f52735Y.m18301f()) {
                this.f52182T0 = (byte) 1;
                return true;
            }
            this.f52182T0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52185o0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52186p0);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.f52192v0);
            }
            for (int i10 = 0; i10 < this.f52191u0.size(); i10++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52191u0.get(i10)).intValue());
            }
            if ((this.f52185o0 & 2) == 2) {
                codedOutputStream.writeInt32(3, this.f52187q0);
            }
            if ((this.f52185o0 & 4) == 4) {
                codedOutputStream.writeInt32(4, this.f52188r0);
            }
            for (int i11 = 0; i11 < this.f52189s0.size(); i11++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f52189s0.get(i11));
            }
            for (int i12 = 0; i12 < this.f52190t0.size(); i12++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f52190t0.get(i12));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.f52194x0);
            }
            for (int i13 = 0; i13 < this.f52193w0.size(); i13++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52193w0.get(i13)).intValue());
            }
            for (int i14 = 0; i14 < this.f52164B0.size(); i14++) {
                codedOutputStream.writeMessage(8, (MessageLite) this.f52164B0.get(i14));
            }
            for (int i15 = 0; i15 < this.f52165C0.size(); i15++) {
                codedOutputStream.writeMessage(9, (MessageLite) this.f52165C0.get(i15));
            }
            for (int i16 = 0; i16 < this.f52166D0.size(); i16++) {
                codedOutputStream.writeMessage(10, (MessageLite) this.f52166D0.get(i16));
            }
            for (int i17 = 0; i17 < this.f52167E0.size(); i17++) {
                codedOutputStream.writeMessage(11, (MessageLite) this.f52167E0.get(i17));
            }
            for (int i18 = 0; i18 < this.f52168F0.size(); i18++) {
                codedOutputStream.writeMessage(13, (MessageLite) this.f52168F0.get(i18));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(130);
                codedOutputStream.writeRawVarint32(this.f52170H0);
            }
            for (int i19 = 0; i19 < this.f52169G0.size(); i19++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52169G0.get(i19)).intValue());
            }
            if ((this.f52185o0 & 8) == 8) {
                codedOutputStream.writeInt32(17, this.f52171I0);
            }
            if ((this.f52185o0 & 16) == 16) {
                codedOutputStream.writeMessage(18, this.f52172J0);
            }
            if ((this.f52185o0 & 32) == 32) {
                codedOutputStream.writeInt32(19, this.f52173K0);
            }
            for (int i20 = 0; i20 < this.f52195y0.size(); i20++) {
                codedOutputStream.writeMessage(20, (MessageLite) this.f52195y0.get(i20));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(170);
                codedOutputStream.writeRawVarint32(this.f52163A0);
            }
            for (int i21 = 0; i21 < this.f52196z0.size(); i21++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52196z0.get(i21)).intValue());
            }
            if (getMultiFieldValueClassUnderlyingNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(178);
                codedOutputStream.writeRawVarint32(this.f52175M0);
            }
            for (int i22 = 0; i22 < this.f52174L0.size(); i22++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52174L0.get(i22)).intValue());
            }
            for (int i23 = 0; i23 < this.f52176N0.size(); i23++) {
                codedOutputStream.writeMessage(23, (MessageLite) this.f52176N0.get(i23));
            }
            if (getMultiFieldValueClassUnderlyingTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(194);
                codedOutputStream.writeRawVarint32(this.f52178P0);
            }
            for (int i24 = 0; i24 < this.f52177O0.size(); i24++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52177O0.get(i24)).intValue());
            }
            if ((this.f52185o0 & 64) == 64) {
                codedOutputStream.writeMessage(30, this.f52179Q0);
            }
            for (int i25 = 0; i25 < this.f52180R0.size(); i25++) {
                codedOutputStream.writeInt32(31, ((Integer) this.f52180R0.get(i25)).intValue());
            }
            if ((this.f52185o0 & 128) == 128) {
                codedOutputStream.writeMessage(32, this.f52181S0);
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52184Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Class getDefaultInstanceForType() {
            return f52162V0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Class() {
            this.f52192v0 = -1;
            this.f52194x0 = -1;
            this.f52163A0 = -1;
            this.f52170H0 = -1;
            this.f52175M0 = -1;
            this.f52178P0 = -1;
            this.f52182T0 = (byte) -1;
            this.f52183U0 = -1;
            this.f52184Z = ByteString.EMPTY;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Class(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            boolean z6;
            this.f52192v0 = -1;
            this.f52194x0 = -1;
            this.f52163A0 = -1;
            this.f52170H0 = -1;
            this.f52175M0 = -1;
            this.f52178P0 = -1;
            this.f52182T0 = (byte) -1;
            this.f52183U0 = -1;
            m18251e();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                z6 = true;
                                z10 = true;
                                continue;
                            case 8:
                                z6 = true;
                                this.f52185o0 |= 1;
                                this.f52186p0 = codedInputStream.readInt32();
                                continue;
                            case 16:
                                if ((i10 & 32) != 32) {
                                    this.f52191u0 = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f52191u0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 18:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52191u0 = new ArrayList();
                                    i10 |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52191u0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                break;
                            case 24:
                                this.f52185o0 |= 2;
                                this.f52187q0 = codedInputStream.readInt32();
                                break;
                            case 32:
                                this.f52185o0 |= 4;
                                this.f52188r0 = codedInputStream.readInt32();
                                break;
                            case 42:
                                if ((i10 & 8) != 8) {
                                    this.f52189s0 = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f52189s0.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                break;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                if ((i10 & 16) != 16) {
                                    this.f52190t0 = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f52190t0.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                break;
                            case 56:
                                if ((i10 & 64) != 64) {
                                    this.f52193w0 = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f52193w0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 58:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 64) != 64 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52193w0 = new ArrayList();
                                    i10 |= 64;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52193w0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                break;
                            case 66:
                                if ((i10 & 512) != 512) {
                                    this.f52164B0 = new ArrayList();
                                    i10 |= 512;
                                }
                                this.f52164B0.add(codedInputStream.readMessage(Constructor.PARSER, extensionRegistryLite));
                                break;
                            case 74:
                                if ((i10 & 1024) != 1024) {
                                    this.f52165C0 = new ArrayList();
                                    i10 |= 1024;
                                }
                                this.f52165C0.add(codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                                break;
                            case 82:
                                if ((i10 & 2048) != 2048) {
                                    this.f52166D0 = new ArrayList();
                                    i10 |= 2048;
                                }
                                this.f52166D0.add(codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                                break;
                            case 90:
                                if ((i10 & 4096) != 4096) {
                                    this.f52167E0 = new ArrayList();
                                    i10 |= 4096;
                                }
                                this.f52167E0.add(codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                                break;
                            case 106:
                                if ((i10 & 8192) != 8192) {
                                    this.f52168F0 = new ArrayList();
                                    i10 |= 8192;
                                }
                                this.f52168F0.add(codedInputStream.readMessage(EnumEntry.PARSER, extensionRegistryLite));
                                break;
                            case 128:
                                if ((i10 & 16384) != 16384) {
                                    this.f52169G0 = new ArrayList();
                                    i10 |= 16384;
                                }
                                this.f52169G0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 130:
                                int iPushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 16384) != 16384 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52169G0 = new ArrayList();
                                    i10 |= 16384;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52169G0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit3);
                                break;
                            case 136:
                                this.f52185o0 |= 8;
                                this.f52171I0 = codedInputStream.readInt32();
                                break;
                            case 146:
                                Type.Builder builder = (this.f52185o0 & 16) == 16 ? this.f52172J0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f52172J0 = type;
                                if (builder != 0) {
                                    builder.mergeFrom(type);
                                    this.f52172J0 = builder.buildPartial();
                                }
                                this.f52185o0 |= 16;
                                break;
                            case 152:
                                this.f52185o0 |= 32;
                                this.f52173K0 = codedInputStream.readInt32();
                                break;
                            case 162:
                                if ((i10 & 128) != 128) {
                                    this.f52195y0 = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f52195y0.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                break;
                            case 168:
                                if ((i10 & 256) != 256) {
                                    this.f52196z0 = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f52196z0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 170:
                                int iPushLimit4 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52196z0 = new ArrayList();
                                    i10 |= 256;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52196z0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit4);
                                break;
                            case 176:
                                if ((i10 & 262144) != 262144) {
                                    this.f52174L0 = new ArrayList();
                                    i10 |= 262144;
                                }
                                this.f52174L0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 178:
                                int iPushLimit5 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 262144) != 262144 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52174L0 = new ArrayList();
                                    i10 |= 262144;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52174L0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit5);
                                break;
                            case 186:
                                if ((i10 & 524288) != 524288) {
                                    this.f52176N0 = new ArrayList();
                                    i10 |= 524288;
                                }
                                this.f52176N0.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                break;
                            case 192:
                                if ((i10 & 1048576) != 1048576) {
                                    this.f52177O0 = new ArrayList();
                                    i10 |= 1048576;
                                }
                                this.f52177O0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 194:
                                int iPushLimit6 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 1048576) != 1048576 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52177O0 = new ArrayList();
                                    i10 |= 1048576;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52177O0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit6);
                                break;
                            case 242:
                                TypeTable.Builder builder2 = (this.f52185o0 & 64) == 64 ? this.f52179Q0.toBuilder() : null;
                                TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                this.f52179Q0 = typeTable;
                                if (builder2 != 0) {
                                    builder2.mergeFrom(typeTable);
                                    this.f52179Q0 = builder2.buildPartial();
                                }
                                this.f52185o0 |= 64;
                                break;
                            case 248:
                                if ((i10 & 4194304) != 4194304) {
                                    this.f52180R0 = new ArrayList();
                                    i10 |= 4194304;
                                }
                                this.f52180R0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 250:
                                int iPushLimit7 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 4194304) != 4194304 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52180R0 = new ArrayList();
                                    i10 |= 4194304;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52180R0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit7);
                                break;
                            case 258:
                                VersionRequirementTable.Builder builder3 = (this.f52185o0 & 128) == 128 ? this.f52181S0.toBuilder() : null;
                                VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                this.f52181S0 = versionRequirementTable;
                                if (builder3 != 0) {
                                    builder3.mergeFrom(versionRequirementTable);
                                    this.f52181S0 = builder3.buildPartial();
                                }
                                this.f52185o0 |= 128;
                                break;
                            default:
                                if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    z10 = true;
                                }
                                break;
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 32) == 32) {
                            this.f52191u0 = DesugarCollections.unmodifiableList(this.f52191u0);
                        }
                        if ((i10 & 8) == 8) {
                            this.f52189s0 = DesugarCollections.unmodifiableList(this.f52189s0);
                        }
                        if ((i10 & 16) == 16) {
                            this.f52190t0 = DesugarCollections.unmodifiableList(this.f52190t0);
                        }
                        if ((i10 & 64) == 64) {
                            this.f52193w0 = DesugarCollections.unmodifiableList(this.f52193w0);
                        }
                        if ((i10 & 512) == 512) {
                            this.f52164B0 = DesugarCollections.unmodifiableList(this.f52164B0);
                        }
                        if ((i10 & 1024) == 1024) {
                            this.f52165C0 = DesugarCollections.unmodifiableList(this.f52165C0);
                        }
                        if ((i10 & 2048) == 2048) {
                            this.f52166D0 = DesugarCollections.unmodifiableList(this.f52166D0);
                        }
                        if ((i10 & 4096) == 4096) {
                            this.f52167E0 = DesugarCollections.unmodifiableList(this.f52167E0);
                        }
                        if ((i10 & 8192) == 8192) {
                            this.f52168F0 = DesugarCollections.unmodifiableList(this.f52168F0);
                        }
                        if ((i10 & 16384) == 16384) {
                            this.f52169G0 = DesugarCollections.unmodifiableList(this.f52169G0);
                        }
                        if ((i10 & 128) == 128) {
                            this.f52195y0 = DesugarCollections.unmodifiableList(this.f52195y0);
                        }
                        if ((i10 & 256) == 256) {
                            this.f52196z0 = DesugarCollections.unmodifiableList(this.f52196z0);
                        }
                        if ((i10 & 262144) == 262144) {
                            this.f52174L0 = DesugarCollections.unmodifiableList(this.f52174L0);
                        }
                        if ((i10 & 524288) == 524288) {
                            this.f52176N0 = DesugarCollections.unmodifiableList(this.f52176N0);
                        }
                        if ((i10 & 1048576) == 1048576) {
                            this.f52177O0 = DesugarCollections.unmodifiableList(this.f52177O0);
                        }
                        if ((i10 & 4194304) == 4194304) {
                            this.f52180R0 = DesugarCollections.unmodifiableList(this.f52180R0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52184Z = outputNewOutput.toByteString();
                        }
                        m18285b();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i10 & 32) == 32) {
                this.f52191u0 = DesugarCollections.unmodifiableList(this.f52191u0);
            }
            if ((i10 & 8) == 8) {
                this.f52189s0 = DesugarCollections.unmodifiableList(this.f52189s0);
            }
            if ((i10 & 16) == 16) {
                this.f52190t0 = DesugarCollections.unmodifiableList(this.f52190t0);
            }
            if ((i10 & 64) == 64) {
                this.f52193w0 = DesugarCollections.unmodifiableList(this.f52193w0);
            }
            if ((i10 & 512) == 512) {
                this.f52164B0 = DesugarCollections.unmodifiableList(this.f52164B0);
            }
            if ((i10 & 1024) == 1024) {
                this.f52165C0 = DesugarCollections.unmodifiableList(this.f52165C0);
            }
            if ((i10 & 2048) == 2048) {
                this.f52166D0 = DesugarCollections.unmodifiableList(this.f52166D0);
            }
            if ((i10 & 4096) == 4096) {
                this.f52167E0 = DesugarCollections.unmodifiableList(this.f52167E0);
            }
            if ((i10 & 8192) == 8192) {
                this.f52168F0 = DesugarCollections.unmodifiableList(this.f52168F0);
            }
            if ((i10 & 16384) == 16384) {
                this.f52169G0 = DesugarCollections.unmodifiableList(this.f52169G0);
            }
            if ((i10 & 128) == 128) {
                this.f52195y0 = DesugarCollections.unmodifiableList(this.f52195y0);
            }
            if ((i10 & 256) == 256) {
                this.f52196z0 = DesugarCollections.unmodifiableList(this.f52196z0);
            }
            if ((i10 & 262144) == 262144) {
                this.f52174L0 = DesugarCollections.unmodifiableList(this.f52174L0);
            }
            if ((i10 & 524288) == 524288) {
                this.f52176N0 = DesugarCollections.unmodifiableList(this.f52176N0);
            }
            if ((i10 & 1048576) == 1048576) {
                this.f52177O0 = DesugarCollections.unmodifiableList(this.f52177O0);
            }
            if ((i10 & 4194304) == 4194304) {
                this.f52180R0 = DesugarCollections.unmodifiableList(this.f52180R0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52184Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new C16579e();

        /* JADX INFO: renamed from: u0 */
        public static final Constructor f52224u0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52225Z;

        /* JADX INFO: renamed from: o0 */
        public int f52226o0;

        /* JADX INFO: renamed from: p0 */
        public int f52227p0;

        /* JADX INFO: renamed from: q0 */
        public List f52228q0;

        /* JADX INFO: renamed from: r0 */
        public List f52229r0;

        /* JADX INFO: renamed from: s0 */
        public byte f52230s0;

        /* JADX INFO: renamed from: t0 */
        public int f52231t0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {

            /* JADX INFO: renamed from: p0 */
            public int f52232p0;

            /* JADX INFO: renamed from: q0 */
            public int f52233q0 = 6;

            /* JADX INFO: renamed from: r0 */
            public List f52234r0 = Collections.emptyList();

            /* JADX INFO: renamed from: s0 */
            public List f52235s0 = Collections.emptyList();

            public Constructor buildPartial() {
                Constructor constructor = new Constructor(this);
                int i10 = this.f52232p0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                constructor.f52227p0 = this.f52233q0;
                if ((i10 & 2) == 2) {
                    this.f52234r0 = DesugarCollections.unmodifiableList(this.f52234r0);
                    this.f52232p0 &= -3;
                }
                constructor.f52228q0 = this.f52234r0;
                if ((this.f52232p0 & 4) == 4) {
                    this.f52235s0 = DesugarCollections.unmodifiableList(this.f52235s0);
                    this.f52232p0 &= -5;
                }
                constructor.f52229r0 = this.f52235s0;
                constructor.f52226o0 = i11;
                return constructor;
            }

            public ValueParameter getValueParameter(int i10) {
                return (ValueParameter) this.f52234r0.get(i10);
            }

            public int getValueParameterCount() {
                return this.f52234r0.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getValueParameterCount(); i10++) {
                    if (!getValueParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                return this.f52733Z.m18301f();
            }

            public Builder setFlags(int i10) {
                this.f52232p0 |= 1;
                this.f52233q0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Constructor build() {
                Constructor constructorBuildPartial = buildPartial();
                if (constructorBuildPartial.isInitialized()) {
                    return constructorBuildPartial;
                }
                throw new UninitializedMessageException(constructorBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.f52228q0.isEmpty()) {
                    if (this.f52234r0.isEmpty()) {
                        this.f52234r0 = constructor.f52228q0;
                        this.f52232p0 &= -3;
                    } else {
                        if ((this.f52232p0 & 2) != 2) {
                            this.f52234r0 = new ArrayList(this.f52234r0);
                            this.f52232p0 |= 2;
                        }
                        this.f52234r0.addAll(constructor.f52228q0);
                    }
                }
                if (!constructor.f52229r0.isEmpty()) {
                    if (this.f52235s0.isEmpty()) {
                        this.f52235s0 = constructor.f52229r0;
                        this.f52232p0 &= -5;
                    } else {
                        if ((this.f52232p0 & 4) != 4) {
                            this.f52235s0 = new ArrayList(this.f52235s0);
                            this.f52232p0 |= 4;
                        }
                        this.f52235s0.addAll(constructor.f52229r0);
                    }
                }
                m18283a(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.f52225Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        Constructor partialFrom = Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Constructor constructor2 = (Constructor) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            constructor = constructor2;
                            if (constructor != null) {
                                mergeFrom(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (constructor != null) {
                        mergeFrom(constructor);
                    }
                    throw th;
                }
            }
        }

        static {
            Constructor constructor = new Constructor();
            f52224u0 = constructor;
            constructor.f52227p0 = 6;
            constructor.f52228q0 = Collections.emptyList();
            constructor.f52229r0 = Collections.emptyList();
        }

        public Constructor(Builder builder) {
            super(builder);
            this.f52230s0 = (byte) -1;
            this.f52231t0 = -1;
            this.f52225Z = builder.getUnknownFields();
        }

        public static Constructor getDefaultInstance() {
            return f52224u0;
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        public int getFlags() {
            return this.f52227p0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52231t0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52226o0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52227p0) : 0;
            for (int i11 = 0; i11 < this.f52228q0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f52228q0.get(i11));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < this.f52229r0.size(); i12++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52229r0.get(i12)).intValue());
            }
            int size = this.f52225Z.size() + m18284a() + (getVersionRequirementList().size() * 2) + iComputeInt32Size + iComputeInt32SizeNoTag;
            this.f52231t0 = size;
            return size;
        }

        public ValueParameter getValueParameter(int i10) {
            return (ValueParameter) this.f52228q0.get(i10);
        }

        public int getValueParameterCount() {
            return this.f52228q0.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.f52228q0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f52229r0;
        }

        public boolean hasFlags() {
            return (this.f52226o0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52230s0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getValueParameterCount(); i10++) {
                if (!getValueParameter(i10).isInitialized()) {
                    this.f52230s0 = (byte) 0;
                    return false;
                }
            }
            if (this.f52735Y.m18301f()) {
                this.f52230s0 = (byte) 1;
                return true;
            }
            this.f52230s0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52226o0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52227p0);
            }
            for (int i10 = 0; i10 < this.f52228q0.size(); i10++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f52228q0.get(i10));
            }
            for (int i11 = 0; i11 < this.f52229r0.size(); i11++) {
                codedOutputStream.writeInt32(31, ((Integer) this.f52229r0.get(i11)).intValue());
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52225Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Constructor getDefaultInstanceForType() {
            return f52224u0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Constructor() {
            this.f52230s0 = (byte) -1;
            this.f52231t0 = -1;
            this.f52225Z = ByteString.EMPTY;
        }

        public Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52230s0 = (byte) -1;
            this.f52231t0 = -1;
            this.f52227p0 = 6;
            this.f52228q0 = Collections.emptyList();
            this.f52229r0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            int i10 = 0;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f52226o0 |= 1;
                                this.f52227p0 = codedInputStream.readInt32();
                            } else if (tag == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f52228q0 = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f52228q0.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                            } else if (tag == 248) {
                                if ((i10 & 4) != 4) {
                                    this.f52229r0 = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f52229r0.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag != 250) {
                                if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52229r0 = new ArrayList();
                                    i10 |= 4;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52229r0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            }
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 2) == 2) {
                        this.f52228q0 = DesugarCollections.unmodifiableList(this.f52228q0);
                    }
                    if ((i10 & 4) == 4) {
                        this.f52229r0 = DesugarCollections.unmodifiableList(this.f52229r0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52225Z = outputNewOutput.toByteString();
                    }
                    m18285b();
                    throw th2;
                }
            }
            if ((i10 & 2) == 2) {
                this.f52228q0 = DesugarCollections.unmodifiableList(this.f52228q0);
            }
            if ((i10 & 4) == 4) {
                this.f52229r0 = DesugarCollections.unmodifiableList(this.f52229r0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52225Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new C16580f();

        /* JADX INFO: renamed from: q0 */
        public static final Contract f52236q0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52237Y;

        /* JADX INFO: renamed from: Z */
        public List f52238Z;

        /* JADX INFO: renamed from: o0 */
        public byte f52239o0;

        /* JADX INFO: renamed from: p0 */
        public int f52240p0;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52241Z;

            /* JADX INFO: renamed from: o0 */
            public List f52242o0 = Collections.emptyList();

            public Contract buildPartial() {
                Contract contract = new Contract(this);
                if ((this.f52241Z & 1) == 1) {
                    this.f52242o0 = DesugarCollections.unmodifiableList(this.f52242o0);
                    this.f52241Z &= -2;
                }
                contract.f52238Z = this.f52242o0;
                return contract;
            }

            public Effect getEffect(int i10) {
                return (Effect) this.f52242o0.get(i10);
            }

            public int getEffectCount() {
                return this.f52242o0.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getEffectCount(); i10++) {
                    if (!getEffect(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Contract build() {
                Contract contractBuildPartial = buildPartial();
                if (contractBuildPartial.isInitialized()) {
                    return contractBuildPartial;
                }
                throw new UninitializedMessageException(contractBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.f52238Z.isEmpty()) {
                    if (this.f52242o0.isEmpty()) {
                        this.f52242o0 = contract.f52238Z;
                        this.f52241Z &= -2;
                    } else {
                        if ((this.f52241Z & 1) != 1) {
                            this.f52242o0 = new ArrayList(this.f52242o0);
                            this.f52241Z |= 1;
                        }
                        this.f52242o0.addAll(contract.f52238Z);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.f52237Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        Contract partialFrom = Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Contract contract2 = (Contract) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            contract = contract2;
                            if (contract != null) {
                                mergeFrom(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (contract != null) {
                        mergeFrom(contract);
                    }
                    throw th;
                }
            }
        }

        static {
            Contract contract = new Contract();
            f52236q0 = contract;
            contract.f52238Z = Collections.emptyList();
        }

        public Contract() {
            this.f52239o0 = (byte) -1;
            this.f52240p0 = -1;
            this.f52237Y = ByteString.EMPTY;
        }

        public static Contract getDefaultInstance() {
            return f52236q0;
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        public Effect getEffect(int i10) {
            return (Effect) this.f52238Z.get(i10);
        }

        public int getEffectCount() {
            return this.f52238Z.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52240p0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f52238Z.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f52238Z.get(i11));
            }
            int size = this.f52237Y.size() + iComputeMessageSize;
            this.f52240p0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52239o0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getEffectCount(); i10++) {
                if (!getEffect(i10).isInitialized()) {
                    this.f52239o0 = (byte) 0;
                    return false;
                }
            }
            this.f52239o0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f52238Z.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f52238Z.get(i10));
            }
            codedOutputStream.writeRawBytes(this.f52237Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Contract getDefaultInstanceForType() {
            return f52236q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52239o0 = (byte) -1;
            this.f52240p0 = -1;
            this.f52238Z = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            boolean z10 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                if (!z10) {
                                    this.f52238Z = new ArrayList();
                                    z10 = true;
                                }
                                this.f52238Z.add(codedInputStream.readMessage(Effect.PARSER, extensionRegistryLite));
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        if (z10) {
                            this.f52238Z = DesugarCollections.unmodifiableList(this.f52238Z);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52237Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z10) {
                this.f52238Z = DesugarCollections.unmodifiableList(this.f52238Z);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52237Y = outputNewOutput.toByteString();
            }
        }

        public Contract(Builder builder) {
            this.f52239o0 = (byte) -1;
            this.f52240p0 = -1;
            this.f52237Y = builder.getUnknownFields();
        }
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new C16581g();

        /* JADX INFO: renamed from: u0 */
        public static final Effect f52243u0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52244Y;

        /* JADX INFO: renamed from: Z */
        public int f52245Z;

        /* JADX INFO: renamed from: o0 */
        public EffectType f52246o0;

        /* JADX INFO: renamed from: p0 */
        public List f52247p0;

        /* JADX INFO: renamed from: q0 */
        public Expression f52248q0;

        /* JADX INFO: renamed from: r0 */
        public InvocationKind f52249r0;

        /* JADX INFO: renamed from: s0 */
        public byte f52250s0;

        /* JADX INFO: renamed from: t0 */
        public int f52251t0;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52252Z;

            /* JADX INFO: renamed from: o0 */
            public EffectType f52253o0 = EffectType.RETURNS_CONSTANT;

            /* JADX INFO: renamed from: p0 */
            public List f52254p0 = Collections.emptyList();

            /* JADX INFO: renamed from: q0 */
            public Expression f52255q0 = Expression.getDefaultInstance();

            /* JADX INFO: renamed from: r0 */
            public InvocationKind f52256r0 = InvocationKind.AT_MOST_ONCE;

            public Effect buildPartial() {
                Effect effect = new Effect(this);
                int i10 = this.f52252Z;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                effect.f52246o0 = this.f52253o0;
                if ((i10 & 2) == 2) {
                    this.f52254p0 = DesugarCollections.unmodifiableList(this.f52254p0);
                    this.f52252Z &= -3;
                }
                effect.f52247p0 = this.f52254p0;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                effect.f52248q0 = this.f52255q0;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                effect.f52249r0 = this.f52256r0;
                effect.f52245Z = i11;
                return effect;
            }

            public Expression getConclusionOfConditionalEffect() {
                return this.f52255q0;
            }

            public Expression getEffectConstructorArgument(int i10) {
                return (Expression) this.f52254p0.get(i10);
            }

            public int getEffectConstructorArgumentCount() {
                return this.f52254p0.size();
            }

            public boolean hasConclusionOfConditionalEffect() {
                return (this.f52252Z & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getEffectConstructorArgumentCount(); i10++) {
                    if (!getEffectConstructorArgument(i10).isInitialized()) {
                        return false;
                    }
                }
                return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
            }

            public Builder mergeConclusionOfConditionalEffect(Expression expression) {
                if ((this.f52252Z & 4) != 4 || this.f52255q0 == Expression.getDefaultInstance()) {
                    this.f52255q0 = expression;
                } else {
                    this.f52255q0 = Expression.newBuilder(this.f52255q0).mergeFrom(expression).buildPartial();
                }
                this.f52252Z |= 4;
                return this;
            }

            public Builder setEffectType(EffectType effectType) {
                effectType.getClass();
                this.f52252Z |= 1;
                this.f52253o0 = effectType;
                return this;
            }

            public Builder setKind(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f52252Z |= 8;
                this.f52256r0 = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Effect build() {
                Effect effectBuildPartial = buildPartial();
                if (effectBuildPartial.isInitialized()) {
                    return effectBuildPartial;
                }
                throw new UninitializedMessageException(effectBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.f52247p0.isEmpty()) {
                    if (this.f52254p0.isEmpty()) {
                        this.f52254p0 = effect.f52247p0;
                        this.f52252Z &= -3;
                    } else {
                        if ((this.f52252Z & 2) != 2) {
                            this.f52254p0 = new ArrayList(this.f52254p0);
                            this.f52252Z |= 2;
                        }
                        this.f52254p0.addAll(effect.f52247p0);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.f52244Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        Effect partialFrom = Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Effect effect2 = (Effect) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            effect = effect2;
                            if (effect != null) {
                                mergeFrom(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (effect != null) {
                        mergeFrom(effect);
                    }
                    throw th;
                }
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);


            /* JADX INFO: renamed from: Y */
            public final int f52258Y;

            EffectType(int i10) {
                this.f52258Y = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f52258Y;
            }

            public static EffectType valueOf(int i10) {
                if (i10 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i10 == 1) {
                    return CALLS;
                }
                if (i10 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);


            /* JADX INFO: renamed from: Y */
            public final int f52260Y;

            InvocationKind(int i10) {
                this.f52260Y = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f52260Y;
            }

            public static InvocationKind valueOf(int i10) {
                if (i10 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i10 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i10 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }
        }

        static {
            Effect effect = new Effect();
            f52243u0 = effect;
            effect.f52246o0 = EffectType.RETURNS_CONSTANT;
            effect.f52247p0 = Collections.emptyList();
            effect.f52248q0 = Expression.getDefaultInstance();
            effect.f52249r0 = InvocationKind.AT_MOST_ONCE;
        }

        public Effect() {
            this.f52250s0 = (byte) -1;
            this.f52251t0 = -1;
            this.f52244Y = ByteString.EMPTY;
        }

        public static Effect getDefaultInstance() {
            return f52243u0;
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.f52248q0;
        }

        public Expression getEffectConstructorArgument(int i10) {
            return (Expression) this.f52247p0.get(i10);
        }

        public int getEffectConstructorArgumentCount() {
            return this.f52247p0.size();
        }

        public EffectType getEffectType() {
            return this.f52246o0;
        }

        public InvocationKind getKind() {
            return this.f52249r0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52251t0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = (this.f52245Z & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f52246o0.getNumber()) : 0;
            for (int i11 = 0; i11 < this.f52247p0.size(); i11++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f52247p0.get(i11));
            }
            if ((this.f52245Z & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, this.f52248q0);
            }
            if ((this.f52245Z & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.f52249r0.getNumber());
            }
            int size = this.f52244Y.size() + iComputeEnumSize;
            this.f52251t0 = size;
            return size;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.f52245Z & 2) == 2;
        }

        public boolean hasEffectType() {
            return (this.f52245Z & 1) == 1;
        }

        public boolean hasKind() {
            return (this.f52245Z & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52250s0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getEffectConstructorArgumentCount(); i10++) {
                if (!getEffectConstructorArgument(i10).isInitialized()) {
                    this.f52250s0 = (byte) 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.f52250s0 = (byte) 1;
                return true;
            }
            this.f52250s0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f52245Z & 1) == 1) {
                codedOutputStream.writeEnum(1, this.f52246o0.getNumber());
            }
            for (int i10 = 0; i10 < this.f52247p0.size(); i10++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f52247p0.get(i10));
            }
            if ((this.f52245Z & 2) == 2) {
                codedOutputStream.writeMessage(3, this.f52248q0);
            }
            if ((this.f52245Z & 4) == 4) {
                codedOutputStream.writeEnum(4, this.f52249r0.getNumber());
            }
            codedOutputStream.writeRawBytes(this.f52244Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Effect getDefaultInstanceForType() {
            return f52243u0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52250s0 = (byte) -1;
            this.f52251t0 = -1;
            this.f52246o0 = EffectType.RETURNS_CONSTANT;
            this.f52247p0 = Collections.emptyList();
            this.f52248q0 = Expression.getDefaultInstance();
            this.f52249r0 = InvocationKind.AT_MOST_ONCE;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            char c9 = 0;
            while (!z6) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i10 = codedInputStream.readEnum();
                                    EffectType effectTypeValueOf = EffectType.valueOf(i10);
                                    if (effectTypeValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i10);
                                    } else {
                                        this.f52245Z |= 1;
                                        this.f52246o0 = effectTypeValueOf;
                                    }
                                } else if (tag == 18) {
                                    if ((c9 & 2) != 2) {
                                        this.f52247p0 = new ArrayList();
                                        c9 = 2;
                                    }
                                    this.f52247p0.add(codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite));
                                } else if (tag == 26) {
                                    Expression.Builder builder = (this.f52245Z & 2) == 2 ? this.f52248q0.toBuilder() : null;
                                    Expression expression = (Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite);
                                    this.f52248q0 = expression;
                                    if (builder != null) {
                                        builder.mergeFrom(expression);
                                        this.f52248q0 = builder.buildPartial();
                                    }
                                    this.f52245Z |= 2;
                                } else if (tag != 32) {
                                    if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    int i11 = codedInputStream.readEnum();
                                    InvocationKind invocationKindValueOf = InvocationKind.valueOf(i11);
                                    if (invocationKindValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i11);
                                    } else {
                                        this.f52245Z |= 4;
                                        this.f52249r0 = invocationKindValueOf;
                                    }
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
                    if ((c9 & 2) == 2) {
                        this.f52247p0 = DesugarCollections.unmodifiableList(this.f52247p0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52244Y = outputNewOutput.toByteString();
                    }
                    throw th2;
                }
            }
            if ((c9 & 2) == 2) {
                this.f52247p0 = DesugarCollections.unmodifiableList(this.f52247p0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52244Y = outputNewOutput.toByteString();
            }
        }

        public Effect(Builder builder) {
            this.f52250s0 = (byte) -1;
            this.f52251t0 = -1;
            this.f52244Y = builder.getUnknownFields();
        }
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new C16582h();

        /* JADX INFO: renamed from: s0 */
        public static final EnumEntry f52261s0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52262Z;

        /* JADX INFO: renamed from: o0 */
        public int f52263o0;

        /* JADX INFO: renamed from: p0 */
        public int f52264p0;

        /* JADX INFO: renamed from: q0 */
        public byte f52265q0;

        /* JADX INFO: renamed from: r0 */
        public int f52266r0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {

            /* JADX INFO: renamed from: p0 */
            public int f52267p0;

            /* JADX INFO: renamed from: q0 */
            public int f52268q0;

            public EnumEntry buildPartial() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i10 = (this.f52267p0 & 1) != 1 ? 0 : 1;
                enumEntry.f52264p0 = this.f52268q0;
                enumEntry.f52263o0 = i10;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return this.f52733Z.m18301f();
            }

            public Builder setName(int i10) {
                this.f52267p0 |= 1;
                this.f52268q0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public EnumEntry build() {
                EnumEntry enumEntryBuildPartial = buildPartial();
                if (enumEntryBuildPartial.isInitialized()) {
                    return enumEntryBuildPartial;
                }
                throw new UninitializedMessageException(enumEntryBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                m18283a(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.f52262Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        EnumEntry partialFrom = EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        EnumEntry enumEntry2 = (EnumEntry) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                mergeFrom(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (enumEntry != null) {
                        mergeFrom(enumEntry);
                    }
                    throw th;
                }
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry();
            f52261s0 = enumEntry;
            enumEntry.f52264p0 = 0;
        }

        public EnumEntry(Builder builder) {
            super(builder);
            this.f52265q0 = (byte) -1;
            this.f52266r0 = -1;
            this.f52262Z = builder.getUnknownFields();
        }

        public static EnumEntry getDefaultInstance() {
            return f52261s0;
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        public int getName() {
            return this.f52264p0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52266r0;
            if (i10 != -1) {
                return i10;
            }
            int size = this.f52262Z.size() + m18284a() + ((this.f52263o0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52264p0) : 0);
            this.f52266r0 = size;
            return size;
        }

        public boolean hasName() {
            return (this.f52263o0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52265q0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (this.f52735Y.m18301f()) {
                this.f52265q0 = (byte) 1;
                return true;
            }
            this.f52265q0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52263o0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52264p0);
            }
            extensionWriter.writeUntil(RCHTTPStatusCodes.SUCCESS, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52262Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public EnumEntry getDefaultInstanceForType() {
            return f52261s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public EnumEntry() {
            this.f52265q0 = (byte) -1;
            this.f52266r0 = -1;
            this.f52262Z = ByteString.EMPTY;
        }

        public EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52265q0 = (byte) -1;
            this.f52266r0 = -1;
            boolean z6 = false;
            this.f52264p0 = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 8) {
                                if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f52263o0 |= 1;
                                this.f52264p0 = codedInputStream.readInt32();
                            }
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52262Z = outputNewOutput.toByteString();
                    }
                    m18285b();
                    throw th2;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52262Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static Parser<Expression> PARSER = new C16583i();

        /* JADX INFO: renamed from: x0 */
        public static final Expression f52269x0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52270Y;

        /* JADX INFO: renamed from: Z */
        public int f52271Z;

        /* JADX INFO: renamed from: o0 */
        public int f52272o0;

        /* JADX INFO: renamed from: p0 */
        public int f52273p0;

        /* JADX INFO: renamed from: q0 */
        public ConstantValue f52274q0;

        /* JADX INFO: renamed from: r0 */
        public Type f52275r0;

        /* JADX INFO: renamed from: s0 */
        public int f52276s0;

        /* JADX INFO: renamed from: t0 */
        public List f52277t0;

        /* JADX INFO: renamed from: u0 */
        public List f52278u0;

        /* JADX INFO: renamed from: v0 */
        public byte f52279v0;

        /* JADX INFO: renamed from: w0 */
        public int f52280w0;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52281Z;

            /* JADX INFO: renamed from: o0 */
            public int f52282o0;

            /* JADX INFO: renamed from: p0 */
            public int f52283p0;

            /* JADX INFO: renamed from: s0 */
            public int f52286s0;

            /* JADX INFO: renamed from: q0 */
            public ConstantValue f52284q0 = ConstantValue.TRUE;

            /* JADX INFO: renamed from: r0 */
            public Type f52285r0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: t0 */
            public List f52287t0 = Collections.emptyList();

            /* JADX INFO: renamed from: u0 */
            public List f52288u0 = Collections.emptyList();

            public Expression buildPartial() {
                Expression expression = new Expression(this);
                int i10 = this.f52281Z;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                expression.f52272o0 = this.f52282o0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                expression.f52273p0 = this.f52283p0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                expression.f52274q0 = this.f52284q0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                expression.f52275r0 = this.f52285r0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                expression.f52276s0 = this.f52286s0;
                if ((i10 & 32) == 32) {
                    this.f52287t0 = DesugarCollections.unmodifiableList(this.f52287t0);
                    this.f52281Z &= -33;
                }
                expression.f52277t0 = this.f52287t0;
                if ((this.f52281Z & 64) == 64) {
                    this.f52288u0 = DesugarCollections.unmodifiableList(this.f52288u0);
                    this.f52281Z &= -65;
                }
                expression.f52278u0 = this.f52288u0;
                expression.f52271Z = i11;
                return expression;
            }

            public Expression getAndArgument(int i10) {
                return (Expression) this.f52287t0.get(i10);
            }

            public int getAndArgumentCount() {
                return this.f52287t0.size();
            }

            public Type getIsInstanceType() {
                return this.f52285r0;
            }

            public Expression getOrArgument(int i10) {
                return (Expression) this.f52288u0.get(i10);
            }

            public int getOrArgumentCount() {
                return this.f52288u0.size();
            }

            public boolean hasIsInstanceType() {
                return (this.f52281Z & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getAndArgumentCount(); i10++) {
                    if (!getAndArgument(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < getOrArgumentCount(); i11++) {
                    if (!getOrArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeIsInstanceType(Type type) {
                if ((this.f52281Z & 8) != 8 || this.f52285r0 == Type.getDefaultInstance()) {
                    this.f52285r0 = type;
                } else {
                    this.f52285r0 = Type.newBuilder(this.f52285r0).mergeFrom(type).buildPartial();
                }
                this.f52281Z |= 8;
                return this;
            }

            public Builder setConstantValue(ConstantValue constantValue) {
                constantValue.getClass();
                this.f52281Z |= 4;
                this.f52284q0 = constantValue;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f52281Z |= 1;
                this.f52282o0 = i10;
                return this;
            }

            public Builder setIsInstanceTypeId(int i10) {
                this.f52281Z |= 16;
                this.f52286s0 = i10;
                return this;
            }

            public Builder setValueParameterReference(int i10) {
                this.f52281Z |= 2;
                this.f52283p0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Expression build() {
                Expression expressionBuildPartial = buildPartial();
                if (expressionBuildPartial.isInitialized()) {
                    return expressionBuildPartial;
                }
                throw new UninitializedMessageException(expressionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.f52277t0.isEmpty()) {
                    if (this.f52287t0.isEmpty()) {
                        this.f52287t0 = expression.f52277t0;
                        this.f52281Z &= -33;
                    } else {
                        if ((this.f52281Z & 32) != 32) {
                            this.f52287t0 = new ArrayList(this.f52287t0);
                            this.f52281Z |= 32;
                        }
                        this.f52287t0.addAll(expression.f52277t0);
                    }
                }
                if (!expression.f52278u0.isEmpty()) {
                    if (this.f52288u0.isEmpty()) {
                        this.f52288u0 = expression.f52278u0;
                        this.f52281Z &= -65;
                    } else {
                        if ((this.f52281Z & 64) != 64) {
                            this.f52288u0 = new ArrayList(this.f52288u0);
                            this.f52281Z |= 64;
                        }
                        this.f52288u0.addAll(expression.f52278u0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.f52270Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        Expression partialFrom = Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Expression expression2 = (Expression) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            expression = expression2;
                            if (expression != null) {
                                mergeFrom(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (expression != null) {
                        mergeFrom(expression);
                    }
                    throw th;
                }
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);


            /* JADX INFO: renamed from: Y */
            public final int f52290Y;

            ConstantValue(int i10) {
                this.f52290Y = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f52290Y;
            }

            public static ConstantValue valueOf(int i10) {
                if (i10 == 0) {
                    return TRUE;
                }
                if (i10 == 1) {
                    return FALSE;
                }
                if (i10 != 2) {
                    return null;
                }
                return NULL;
            }
        }

        static {
            Expression expression = new Expression();
            f52269x0 = expression;
            expression.f52272o0 = 0;
            expression.f52273p0 = 0;
            expression.f52274q0 = ConstantValue.TRUE;
            expression.f52275r0 = Type.getDefaultInstance();
            expression.f52276s0 = 0;
            expression.f52277t0 = Collections.emptyList();
            expression.f52278u0 = Collections.emptyList();
        }

        public Expression() {
            this.f52279v0 = (byte) -1;
            this.f52280w0 = -1;
            this.f52270Y = ByteString.EMPTY;
        }

        public static Expression getDefaultInstance() {
            return f52269x0;
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        public Expression getAndArgument(int i10) {
            return (Expression) this.f52277t0.get(i10);
        }

        public int getAndArgumentCount() {
            return this.f52277t0.size();
        }

        public ConstantValue getConstantValue() {
            return this.f52274q0;
        }

        public int getFlags() {
            return this.f52272o0;
        }

        public Type getIsInstanceType() {
            return this.f52275r0;
        }

        public int getIsInstanceTypeId() {
            return this.f52276s0;
        }

        public Expression getOrArgument(int i10) {
            return (Expression) this.f52278u0.get(i10);
        }

        public int getOrArgumentCount() {
            return this.f52278u0.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52280w0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52271Z & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52272o0) : 0;
            if ((this.f52271Z & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52273p0);
            }
            if ((this.f52271Z & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f52274q0.getNumber());
            }
            if ((this.f52271Z & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f52275r0);
            }
            if ((this.f52271Z & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f52276s0);
            }
            for (int i11 = 0; i11 < this.f52277t0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f52277t0.get(i11));
            }
            for (int i12 = 0; i12 < this.f52278u0.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, (MessageLite) this.f52278u0.get(i12));
            }
            int size = this.f52270Y.size() + iComputeInt32Size;
            this.f52280w0 = size;
            return size;
        }

        public int getValueParameterReference() {
            return this.f52273p0;
        }

        public boolean hasConstantValue() {
            return (this.f52271Z & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.f52271Z & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.f52271Z & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.f52271Z & 16) == 16;
        }

        public boolean hasValueParameterReference() {
            return (this.f52271Z & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52279v0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.f52279v0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getAndArgumentCount(); i10++) {
                if (!getAndArgument(i10).isInitialized()) {
                    this.f52279v0 = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < getOrArgumentCount(); i11++) {
                if (!getOrArgument(i11).isInitialized()) {
                    this.f52279v0 = (byte) 0;
                    return false;
                }
            }
            this.f52279v0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f52271Z & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52272o0);
            }
            if ((this.f52271Z & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f52273p0);
            }
            if ((this.f52271Z & 4) == 4) {
                codedOutputStream.writeEnum(3, this.f52274q0.getNumber());
            }
            if ((this.f52271Z & 8) == 8) {
                codedOutputStream.writeMessage(4, this.f52275r0);
            }
            if ((this.f52271Z & 16) == 16) {
                codedOutputStream.writeInt32(5, this.f52276s0);
            }
            for (int i10 = 0; i10 < this.f52277t0.size(); i10++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f52277t0.get(i10));
            }
            for (int i11 = 0; i11 < this.f52278u0.size(); i11++) {
                codedOutputStream.writeMessage(7, (MessageLite) this.f52278u0.get(i11));
            }
            codedOutputStream.writeRawBytes(this.f52270Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Expression getDefaultInstanceForType() {
            return f52269x0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52279v0 = (byte) -1;
            this.f52280w0 = -1;
            boolean z6 = false;
            this.f52272o0 = 0;
            this.f52273p0 = 0;
            this.f52274q0 = ConstantValue.TRUE;
            this.f52275r0 = Type.getDefaultInstance();
            this.f52276s0 = 0;
            this.f52277t0 = Collections.emptyList();
            this.f52278u0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            int i10 = 0;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f52271Z |= 1;
                                this.f52272o0 = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f52271Z |= 2;
                                this.f52273p0 = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i11 = codedInputStream.readEnum();
                                ConstantValue constantValueValueOf = ConstantValue.valueOf(i11);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.f52271Z |= 4;
                                    this.f52274q0 = constantValueValueOf;
                                }
                            } else if (tag == 34) {
                                Type.Builder builder = (this.f52271Z & 8) == 8 ? this.f52275r0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f52275r0 = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f52275r0 = builder.buildPartial();
                                }
                                this.f52271Z |= 8;
                            } else if (tag == 40) {
                                this.f52271Z |= 16;
                                this.f52276s0 = codedInputStream.readInt32();
                            } else if (tag == 50) {
                                if ((i10 & 32) != 32) {
                                    this.f52277t0 = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f52277t0.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (tag != 58) {
                                if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                if ((i10 & 64) != 64) {
                                    this.f52278u0 = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f52278u0.add(codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 32) == 32) {
                            this.f52277t0 = DesugarCollections.unmodifiableList(this.f52277t0);
                        }
                        if ((i10 & 64) == 64) {
                            this.f52278u0 = DesugarCollections.unmodifiableList(this.f52278u0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52270Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i10 & 32) == 32) {
                this.f52277t0 = DesugarCollections.unmodifiableList(this.f52277t0);
            }
            if ((i10 & 64) == 64) {
                this.f52278u0 = DesugarCollections.unmodifiableList(this.f52278u0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52270Y = outputNewOutput.toByteString();
            }
        }

        public Expression(Builder builder) {
            this.f52279v0 = (byte) -1;
            this.f52280w0 = -1;
            this.f52270Y = builder.getUnknownFields();
        }
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {

        /* JADX INFO: renamed from: G0 */
        public static final Function f52291G0;
        public static Parser<Function> PARSER = new C16584j();

        /* JADX INFO: renamed from: A0 */
        public List f52292A0;

        /* JADX INFO: renamed from: B0 */
        public TypeTable f52293B0;

        /* JADX INFO: renamed from: C0 */
        public List f52294C0;

        /* JADX INFO: renamed from: D0 */
        public Contract f52295D0;

        /* JADX INFO: renamed from: E0 */
        public byte f52296E0;

        /* JADX INFO: renamed from: F0 */
        public int f52297F0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52298Z;

        /* JADX INFO: renamed from: o0 */
        public int f52299o0;

        /* JADX INFO: renamed from: p0 */
        public int f52300p0;

        /* JADX INFO: renamed from: q0 */
        public int f52301q0;

        /* JADX INFO: renamed from: r0 */
        public int f52302r0;

        /* JADX INFO: renamed from: s0 */
        public Type f52303s0;

        /* JADX INFO: renamed from: t0 */
        public int f52304t0;

        /* JADX INFO: renamed from: u0 */
        public List f52305u0;

        /* JADX INFO: renamed from: v0 */
        public Type f52306v0;

        /* JADX INFO: renamed from: w0 */
        public int f52307w0;

        /* JADX INFO: renamed from: x0 */
        public List f52308x0;

        /* JADX INFO: renamed from: y0 */
        public List f52309y0;

        /* JADX INFO: renamed from: z0 */
        public int f52310z0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {

            /* JADX INFO: renamed from: p0 */
            public int f52315p0;

            /* JADX INFO: renamed from: s0 */
            public int f52318s0;

            /* JADX INFO: renamed from: u0 */
            public int f52320u0;

            /* JADX INFO: renamed from: x0 */
            public int f52323x0;

            /* JADX INFO: renamed from: q0 */
            public int f52316q0 = 6;

            /* JADX INFO: renamed from: r0 */
            public int f52317r0 = 6;

            /* JADX INFO: renamed from: t0 */
            public Type f52319t0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: v0 */
            public List f52321v0 = Collections.emptyList();

            /* JADX INFO: renamed from: w0 */
            public Type f52322w0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: y0 */
            public List f52324y0 = Collections.emptyList();

            /* JADX INFO: renamed from: z0 */
            public List f52325z0 = Collections.emptyList();

            /* JADX INFO: renamed from: A0 */
            public List f52311A0 = Collections.emptyList();

            /* JADX INFO: renamed from: B0 */
            public TypeTable f52312B0 = TypeTable.getDefaultInstance();

            /* JADX INFO: renamed from: C0 */
            public List f52313C0 = Collections.emptyList();

            /* JADX INFO: renamed from: D0 */
            public Contract f52314D0 = Contract.getDefaultInstance();

            public Function buildPartial() {
                Function function = new Function(this);
                int i10 = this.f52315p0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                function.f52300p0 = this.f52316q0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                function.f52301q0 = this.f52317r0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                function.f52302r0 = this.f52318s0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                function.f52303s0 = this.f52319t0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                function.f52304t0 = this.f52320u0;
                if ((i10 & 32) == 32) {
                    this.f52321v0 = DesugarCollections.unmodifiableList(this.f52321v0);
                    this.f52315p0 &= -33;
                }
                function.f52305u0 = this.f52321v0;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                function.f52306v0 = this.f52322w0;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                function.f52307w0 = this.f52323x0;
                if ((this.f52315p0 & 256) == 256) {
                    this.f52324y0 = DesugarCollections.unmodifiableList(this.f52324y0);
                    this.f52315p0 &= -257;
                }
                function.f52308x0 = this.f52324y0;
                if ((this.f52315p0 & 512) == 512) {
                    this.f52325z0 = DesugarCollections.unmodifiableList(this.f52325z0);
                    this.f52315p0 &= -513;
                }
                function.f52309y0 = this.f52325z0;
                if ((this.f52315p0 & 1024) == 1024) {
                    this.f52311A0 = DesugarCollections.unmodifiableList(this.f52311A0);
                    this.f52315p0 &= -1025;
                }
                function.f52292A0 = this.f52311A0;
                if ((i10 & 2048) == 2048) {
                    i11 |= 128;
                }
                function.f52293B0 = this.f52312B0;
                if ((this.f52315p0 & 4096) == 4096) {
                    this.f52313C0 = DesugarCollections.unmodifiableList(this.f52313C0);
                    this.f52315p0 &= -4097;
                }
                function.f52294C0 = this.f52313C0;
                if ((i10 & 8192) == 8192) {
                    i11 |= 256;
                }
                function.f52295D0 = this.f52314D0;
                function.f52299o0 = i11;
                return function;
            }

            public Type getContextReceiverType(int i10) {
                return (Type) this.f52324y0.get(i10);
            }

            public int getContextReceiverTypeCount() {
                return this.f52324y0.size();
            }

            public Contract getContract() {
                return this.f52314D0;
            }

            public Type getReceiverType() {
                return this.f52322w0;
            }

            public Type getReturnType() {
                return this.f52319t0;
            }

            public TypeParameter getTypeParameter(int i10) {
                return (TypeParameter) this.f52321v0.get(i10);
            }

            public int getTypeParameterCount() {
                return this.f52321v0.size();
            }

            public TypeTable getTypeTable() {
                return this.f52312B0;
            }

            public ValueParameter getValueParameter(int i10) {
                return (ValueParameter) this.f52311A0.get(i10);
            }

            public int getValueParameterCount() {
                return this.f52311A0.size();
            }

            public boolean hasContract() {
                return (this.f52315p0 & 8192) == 8192;
            }

            public boolean hasName() {
                return (this.f52315p0 & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.f52315p0 & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.f52315p0 & 8) == 8;
            }

            public boolean hasTypeTable() {
                return (this.f52315p0 & 2048) == 2048;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                    if (!getTypeParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getContextReceiverTypeCount(); i11++) {
                    if (!getContextReceiverType(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getValueParameterCount(); i12++) {
                    if (!getValueParameter(i12).isInitialized()) {
                        return false;
                    }
                }
                if (!hasTypeTable() || getTypeTable().isInitialized()) {
                    return (!hasContract() || getContract().isInitialized()) && this.f52733Z.m18301f();
                }
                return false;
            }

            public Builder mergeContract(Contract contract) {
                if ((this.f52315p0 & 8192) != 8192 || this.f52314D0 == Contract.getDefaultInstance()) {
                    this.f52314D0 = contract;
                } else {
                    this.f52314D0 = Contract.newBuilder(this.f52314D0).mergeFrom(contract).buildPartial();
                }
                this.f52315p0 |= 8192;
                return this;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.f52315p0 & 64) != 64 || this.f52322w0 == Type.getDefaultInstance()) {
                    this.f52322w0 = type;
                } else {
                    this.f52322w0 = Type.newBuilder(this.f52322w0).mergeFrom(type).buildPartial();
                }
                this.f52315p0 |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.f52315p0 & 8) != 8 || this.f52319t0 == Type.getDefaultInstance()) {
                    this.f52319t0 = type;
                } else {
                    this.f52319t0 = Type.newBuilder(this.f52319t0).mergeFrom(type).buildPartial();
                }
                this.f52315p0 |= 8;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.f52315p0 & 2048) != 2048 || this.f52312B0 == TypeTable.getDefaultInstance()) {
                    this.f52312B0 = typeTable;
                } else {
                    this.f52312B0 = TypeTable.newBuilder(this.f52312B0).mergeFrom(typeTable).buildPartial();
                }
                this.f52315p0 |= 2048;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f52315p0 |= 1;
                this.f52316q0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f52315p0 |= 4;
                this.f52318s0 = i10;
                return this;
            }

            public Builder setOldFlags(int i10) {
                this.f52315p0 |= 2;
                this.f52317r0 = i10;
                return this;
            }

            public Builder setReceiverTypeId(int i10) {
                this.f52315p0 |= 128;
                this.f52323x0 = i10;
                return this;
            }

            public Builder setReturnTypeId(int i10) {
                this.f52315p0 |= 16;
                this.f52320u0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Function build() {
                Function functionBuildPartial = buildPartial();
                if (functionBuildPartial.isInitialized()) {
                    return functionBuildPartial;
                }
                throw new UninitializedMessageException(functionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.f52305u0.isEmpty()) {
                    if (this.f52321v0.isEmpty()) {
                        this.f52321v0 = function.f52305u0;
                        this.f52315p0 &= -33;
                    } else {
                        if ((this.f52315p0 & 32) != 32) {
                            this.f52321v0 = new ArrayList(this.f52321v0);
                            this.f52315p0 |= 32;
                        }
                        this.f52321v0.addAll(function.f52305u0);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.f52308x0.isEmpty()) {
                    if (this.f52324y0.isEmpty()) {
                        this.f52324y0 = function.f52308x0;
                        this.f52315p0 &= -257;
                    } else {
                        if ((this.f52315p0 & 256) != 256) {
                            this.f52324y0 = new ArrayList(this.f52324y0);
                            this.f52315p0 |= 256;
                        }
                        this.f52324y0.addAll(function.f52308x0);
                    }
                }
                if (!function.f52309y0.isEmpty()) {
                    if (this.f52325z0.isEmpty()) {
                        this.f52325z0 = function.f52309y0;
                        this.f52315p0 &= -513;
                    } else {
                        if ((this.f52315p0 & 512) != 512) {
                            this.f52325z0 = new ArrayList(this.f52325z0);
                            this.f52315p0 |= 512;
                        }
                        this.f52325z0.addAll(function.f52309y0);
                    }
                }
                if (!function.f52292A0.isEmpty()) {
                    if (this.f52311A0.isEmpty()) {
                        this.f52311A0 = function.f52292A0;
                        this.f52315p0 &= -1025;
                    } else {
                        if ((this.f52315p0 & 1024) != 1024) {
                            this.f52311A0 = new ArrayList(this.f52311A0);
                            this.f52315p0 |= 1024;
                        }
                        this.f52311A0.addAll(function.f52292A0);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.f52294C0.isEmpty()) {
                    if (this.f52313C0.isEmpty()) {
                        this.f52313C0 = function.f52294C0;
                        this.f52315p0 &= -4097;
                    } else {
                        if ((this.f52315p0 & 4096) != 4096) {
                            this.f52313C0 = new ArrayList(this.f52313C0);
                            this.f52315p0 |= 4096;
                        }
                        this.f52313C0.addAll(function.f52294C0);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                m18283a(function);
                setUnknownFields(getUnknownFields().concat(function.f52298Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Function function = null;
                try {
                    try {
                        Function partialFrom = Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Function function2 = (Function) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            function = function2;
                            if (function != null) {
                                mergeFrom(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (function != null) {
                        mergeFrom(function);
                    }
                    throw th;
                }
            }
        }

        static {
            Function function = new Function();
            f52291G0 = function;
            function.m18252e();
        }

        public Function(Builder builder) {
            super(builder);
            this.f52310z0 = -1;
            this.f52296E0 = (byte) -1;
            this.f52297F0 = -1;
            this.f52298Z = builder.getUnknownFields();
        }

        public static Function getDefaultInstance() {
            return f52291G0;
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mergeFrom(function);
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        /* JADX INFO: renamed from: e */
        public final void m18252e() {
            this.f52300p0 = 6;
            this.f52301q0 = 6;
            this.f52302r0 = 0;
            this.f52303s0 = Type.getDefaultInstance();
            this.f52304t0 = 0;
            this.f52305u0 = Collections.emptyList();
            this.f52306v0 = Type.getDefaultInstance();
            this.f52307w0 = 0;
            this.f52308x0 = Collections.emptyList();
            this.f52309y0 = Collections.emptyList();
            this.f52292A0 = Collections.emptyList();
            this.f52293B0 = TypeTable.getDefaultInstance();
            this.f52294C0 = Collections.emptyList();
            this.f52295D0 = Contract.getDefaultInstance();
        }

        public Type getContextReceiverType(int i10) {
            return (Type) this.f52308x0.get(i10);
        }

        public int getContextReceiverTypeCount() {
            return this.f52308x0.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.f52309y0;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.f52308x0;
        }

        public Contract getContract() {
            return this.f52295D0;
        }

        public int getFlags() {
            return this.f52300p0;
        }

        public int getName() {
            return this.f52302r0;
        }

        public int getOldFlags() {
            return this.f52301q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.f52306v0;
        }

        public int getReceiverTypeId() {
            return this.f52307w0;
        }

        public Type getReturnType() {
            return this.f52303s0;
        }

        public int getReturnTypeId() {
            return this.f52304t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52297F0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52299o0 & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.f52301q0) : 0;
            if ((this.f52299o0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52302r0);
            }
            if ((this.f52299o0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f52303s0);
            }
            for (int i11 = 0; i11 < this.f52305u0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f52305u0.get(i11));
            }
            if ((this.f52299o0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f52306v0);
            }
            for (int i12 = 0; i12 < this.f52292A0.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f52292A0.get(i12));
            }
            if ((this.f52299o0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f52304t0);
            }
            if ((this.f52299o0 & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.f52307w0);
            }
            if ((this.f52299o0 & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.f52300p0);
            }
            for (int i13 = 0; i13 < this.f52308x0.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, (MessageLite) this.f52308x0.get(i13));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i14 = 0; i14 < this.f52309y0.size(); i14++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52309y0.get(i14)).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f52310z0 = iComputeInt32SizeNoTag;
            if ((this.f52299o0 & 128) == 128) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.f52293B0);
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i15 = 0; i15 < this.f52294C0.size(); i15++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52294C0.get(i15)).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + iComputeMessageSize + iComputeInt32SizeNoTag2;
            if ((this.f52299o0 & 256) == 256) {
                size += CodedOutputStream.computeMessageSize(32, this.f52295D0);
            }
            int size2 = this.f52298Z.size() + m18284a() + size;
            this.f52297F0 = size2;
            return size2;
        }

        public TypeParameter getTypeParameter(int i10) {
            return (TypeParameter) this.f52305u0.get(i10);
        }

        public int getTypeParameterCount() {
            return this.f52305u0.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f52305u0;
        }

        public TypeTable getTypeTable() {
            return this.f52293B0;
        }

        public ValueParameter getValueParameter(int i10) {
            return (ValueParameter) this.f52292A0.get(i10);
        }

        public int getValueParameterCount() {
            return this.f52292A0.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.f52292A0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f52294C0;
        }

        public boolean hasContract() {
            return (this.f52299o0 & 256) == 256;
        }

        public boolean hasFlags() {
            return (this.f52299o0 & 1) == 1;
        }

        public boolean hasName() {
            return (this.f52299o0 & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.f52299o0 & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.f52299o0 & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.f52299o0 & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.f52299o0 & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.f52299o0 & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.f52299o0 & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52296E0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.f52296E0 = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.f52296E0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                if (!getTypeParameter(i10).isInitialized()) {
                    this.f52296E0 = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.f52296E0 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getContextReceiverTypeCount(); i11++) {
                if (!getContextReceiverType(i11).isInitialized()) {
                    this.f52296E0 = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getValueParameterCount(); i12++) {
                if (!getValueParameter(i12).isInitialized()) {
                    this.f52296E0 = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.f52296E0 = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.f52296E0 = (byte) 0;
                return false;
            }
            if (this.f52735Y.m18301f()) {
                this.f52296E0 = (byte) 1;
                return true;
            }
            this.f52296E0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52299o0 & 2) == 2) {
                codedOutputStream.writeInt32(1, this.f52301q0);
            }
            if ((this.f52299o0 & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f52302r0);
            }
            if ((this.f52299o0 & 8) == 8) {
                codedOutputStream.writeMessage(3, this.f52303s0);
            }
            for (int i10 = 0; i10 < this.f52305u0.size(); i10++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f52305u0.get(i10));
            }
            if ((this.f52299o0 & 32) == 32) {
                codedOutputStream.writeMessage(5, this.f52306v0);
            }
            for (int i11 = 0; i11 < this.f52292A0.size(); i11++) {
                codedOutputStream.writeMessage(6, (MessageLite) this.f52292A0.get(i11));
            }
            if ((this.f52299o0 & 16) == 16) {
                codedOutputStream.writeInt32(7, this.f52304t0);
            }
            if ((this.f52299o0 & 64) == 64) {
                codedOutputStream.writeInt32(8, this.f52307w0);
            }
            if ((this.f52299o0 & 1) == 1) {
                codedOutputStream.writeInt32(9, this.f52300p0);
            }
            for (int i12 = 0; i12 < this.f52308x0.size(); i12++) {
                codedOutputStream.writeMessage(10, (MessageLite) this.f52308x0.get(i12));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(90);
                codedOutputStream.writeRawVarint32(this.f52310z0);
            }
            for (int i13 = 0; i13 < this.f52309y0.size(); i13++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52309y0.get(i13)).intValue());
            }
            if ((this.f52299o0 & 128) == 128) {
                codedOutputStream.writeMessage(30, this.f52293B0);
            }
            for (int i14 = 0; i14 < this.f52294C0.size(); i14++) {
                codedOutputStream.writeInt32(31, ((Integer) this.f52294C0.get(i14)).intValue());
            }
            if ((this.f52299o0 & 256) == 256) {
                codedOutputStream.writeMessage(32, this.f52295D0);
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52298Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Function getDefaultInstanceForType() {
            return f52291G0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Function() {
            this.f52310z0 = -1;
            this.f52296E0 = (byte) -1;
            this.f52297F0 = -1;
            this.f52298Z = ByteString.EMPTY;
        }

        public Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52310z0 = -1;
            this.f52296E0 = (byte) -1;
            this.f52297F0 = -1;
            m18252e();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            int i10 = 0;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f52299o0 |= 2;
                                this.f52301q0 = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.f52299o0 |= 4;
                                this.f52302r0 = codedInputStream.readInt32();
                                continue;
                            case 26:
                                Type.Builder builder = (this.f52299o0 & 8) == 8 ? this.f52303s0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f52303s0 = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f52303s0 = builder.buildPartial();
                                }
                                this.f52299o0 |= 8;
                                continue;
                            case 34:
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f52305u0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f52305u0.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 42:
                                Type.Builder builder2 = (this.f52299o0 & 32) == 32 ? this.f52306v0.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f52306v0 = type2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(type2);
                                    this.f52306v0 = builder2.buildPartial();
                                }
                                this.f52299o0 |= 32;
                                continue;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                int i12 = (i10 == true ? 1 : 0) & 1024;
                                i10 = i10;
                                if (i12 != 1024) {
                                    this.f52292A0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 1024;
                                }
                                this.f52292A0.add(codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 56:
                                this.f52299o0 |= 16;
                                this.f52304t0 = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.f52299o0 |= 64;
                                this.f52307w0 = codedInputStream.readInt32();
                                continue;
                            case 72:
                                this.f52299o0 |= 1;
                                this.f52300p0 = codedInputStream.readInt32();
                                continue;
                            case 82:
                                int i13 = (i10 == true ? 1 : 0) & 256;
                                i10 = i10;
                                if (i13 != 256) {
                                    this.f52308x0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 256;
                                }
                                this.f52308x0.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                continue;
                            case 88:
                                int i14 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i14 != 512) {
                                    this.f52309y0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                this.f52309y0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 90:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i15 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i15 != 512 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i10 = i10;
                                    this.f52309y0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                i10 = i10;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52309y0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            case 242:
                                TypeTable.Builder builder3 = (this.f52299o0 & 128) == 128 ? this.f52293B0.toBuilder() : null;
                                TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                this.f52293B0 = typeTable;
                                if (builder3 != null) {
                                    builder3.mergeFrom(typeTable);
                                    this.f52293B0 = builder3.buildPartial();
                                }
                                this.f52299o0 |= 128;
                                continue;
                            case 248:
                                int i16 = (i10 == true ? 1 : 0) & 4096;
                                i10 = i10;
                                if (i16 != 4096) {
                                    this.f52294C0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4096;
                                }
                                this.f52294C0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 250:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i17 = (i10 == true ? 1 : 0) & 4096;
                                i10 = i10;
                                if (i17 != 4096 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i10 = i10;
                                    this.f52294C0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4096;
                                }
                                i10 = i10;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52294C0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                continue;
                            case 258:
                                Contract.Builder builder4 = (this.f52299o0 & 256) == 256 ? this.f52295D0.toBuilder() : null;
                                Contract contract = (Contract) codedInputStream.readMessage(Contract.PARSER, extensionRegistryLite);
                                this.f52295D0 = contract;
                                if (builder4 != null) {
                                    builder4.mergeFrom(contract);
                                    this.f52295D0 = builder4.buildPartial();
                                }
                                this.f52299o0 |= 256;
                                continue;
                            default:
                                if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f52305u0 = DesugarCollections.unmodifiableList(this.f52305u0);
                    }
                    if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                        this.f52292A0 = DesugarCollections.unmodifiableList(this.f52292A0);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == 256) {
                        this.f52308x0 = DesugarCollections.unmodifiableList(this.f52308x0);
                    }
                    if (((i10 == true ? 1 : 0) & 512) == 512) {
                        this.f52309y0 = DesugarCollections.unmodifiableList(this.f52309y0);
                    }
                    if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                        this.f52294C0 = DesugarCollections.unmodifiableList(this.f52294C0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52298Z = outputNewOutput.toByteString();
                    }
                    m18285b();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 32) == 32) {
                this.f52305u0 = DesugarCollections.unmodifiableList(this.f52305u0);
            }
            if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                this.f52292A0 = DesugarCollections.unmodifiableList(this.f52292A0);
            }
            if (((i10 == true ? 1 : 0) & 256) == 256) {
                this.f52308x0 = DesugarCollections.unmodifiableList(this.f52308x0);
            }
            if (((i10 == true ? 1 : 0) & 512) == 512) {
                this.f52309y0 = DesugarCollections.unmodifiableList(this.f52309y0);
            }
            if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                this.f52294C0 = DesugarCollections.unmodifiableList(this.f52294C0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52298Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0),
        FAKE_OVERRIDE(1),
        DELEGATION(2),
        SYNTHESIZED(3);


        /* JADX INFO: renamed from: Y */
        public final int f52327Y;

        MemberKind(int i10) {
            this.f52327Y = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f52327Y;
        }

        public static MemberKind valueOf(int i10) {
            if (i10 == 0) {
                return DECLARATION;
            }
            if (i10 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i10 == 2) {
                return DELEGATION;
            }
            if (i10 != 3) {
                return null;
            }
            return SYNTHESIZED;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0),
        OPEN(1),
        ABSTRACT(2),
        SEALED(3);


        /* JADX INFO: renamed from: Y */
        public final int f52329Y;

        Modality(int i10) {
            this.f52329Y = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f52329Y;
        }

        public static Modality valueOf(int i10) {
            if (i10 == 0) {
                return FINAL;
            }
            if (i10 == 1) {
                return OPEN;
            }
            if (i10 == 2) {
                return ABSTRACT;
            }
            if (i10 != 3) {
                return null;
            }
            return SEALED;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static Parser<Package> PARSER = new C16590k();

        /* JADX INFO: renamed from: w0 */
        public static final Package f52330w0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52331Z;

        /* JADX INFO: renamed from: o0 */
        public int f52332o0;

        /* JADX INFO: renamed from: p0 */
        public List f52333p0;

        /* JADX INFO: renamed from: q0 */
        public List f52334q0;

        /* JADX INFO: renamed from: r0 */
        public List f52335r0;

        /* JADX INFO: renamed from: s0 */
        public TypeTable f52336s0;

        /* JADX INFO: renamed from: t0 */
        public VersionRequirementTable f52337t0;

        /* JADX INFO: renamed from: u0 */
        public byte f52338u0;

        /* JADX INFO: renamed from: v0 */
        public int f52339v0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {

            /* JADX INFO: renamed from: p0 */
            public int f52340p0;

            /* JADX INFO: renamed from: q0 */
            public List f52341q0 = Collections.emptyList();

            /* JADX INFO: renamed from: r0 */
            public List f52342r0 = Collections.emptyList();

            /* JADX INFO: renamed from: s0 */
            public List f52343s0 = Collections.emptyList();

            /* JADX INFO: renamed from: t0 */
            public TypeTable f52344t0 = TypeTable.getDefaultInstance();

            /* JADX INFO: renamed from: u0 */
            public VersionRequirementTable f52345u0 = VersionRequirementTable.getDefaultInstance();

            public Package buildPartial() {
                Package r6 = new Package(this);
                int i10 = this.f52340p0;
                if ((i10 & 1) == 1) {
                    this.f52341q0 = DesugarCollections.unmodifiableList(this.f52341q0);
                    this.f52340p0 &= -2;
                }
                r6.f52333p0 = this.f52341q0;
                if ((this.f52340p0 & 2) == 2) {
                    this.f52342r0 = DesugarCollections.unmodifiableList(this.f52342r0);
                    this.f52340p0 &= -3;
                }
                r6.f52334q0 = this.f52342r0;
                if ((this.f52340p0 & 4) == 4) {
                    this.f52343s0 = DesugarCollections.unmodifiableList(this.f52343s0);
                    this.f52340p0 &= -5;
                }
                r6.f52335r0 = this.f52343s0;
                int i11 = (i10 & 8) != 8 ? 0 : 1;
                r6.f52336s0 = this.f52344t0;
                if ((i10 & 16) == 16) {
                    i11 |= 2;
                }
                r6.f52337t0 = this.f52345u0;
                r6.f52332o0 = i11;
                return r6;
            }

            public Function getFunction(int i10) {
                return (Function) this.f52341q0.get(i10);
            }

            public int getFunctionCount() {
                return this.f52341q0.size();
            }

            public Property getProperty(int i10) {
                return (Property) this.f52342r0.get(i10);
            }

            public int getPropertyCount() {
                return this.f52342r0.size();
            }

            public TypeAlias getTypeAlias(int i10) {
                return (TypeAlias) this.f52343s0.get(i10);
            }

            public int getTypeAliasCount() {
                return this.f52343s0.size();
            }

            public TypeTable getTypeTable() {
                return this.f52344t0;
            }

            public boolean hasTypeTable() {
                return (this.f52340p0 & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getFunctionCount(); i10++) {
                    if (!getFunction(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < getPropertyCount(); i11++) {
                    if (!getProperty(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getTypeAliasCount(); i12++) {
                    if (!getTypeAlias(i12).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && this.f52733Z.m18301f();
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.f52340p0 & 8) != 8 || this.f52344t0 == TypeTable.getDefaultInstance()) {
                    this.f52344t0 = typeTable;
                } else {
                    this.f52344t0 = TypeTable.newBuilder(this.f52344t0).mergeFrom(typeTable).buildPartial();
                }
                this.f52340p0 |= 8;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.f52340p0 & 16) != 16 || this.f52345u0 == VersionRequirementTable.getDefaultInstance()) {
                    this.f52345u0 = versionRequirementTable;
                } else {
                    this.f52345u0 = VersionRequirementTable.newBuilder(this.f52345u0).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.f52340p0 |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Package build() {
                Package packageBuildPartial = buildPartial();
                if (packageBuildPartial.isInitialized()) {
                    return packageBuildPartial;
                }
                throw new UninitializedMessageException(packageBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Package r6) {
                if (r6 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r6.f52333p0.isEmpty()) {
                    if (this.f52341q0.isEmpty()) {
                        this.f52341q0 = r6.f52333p0;
                        this.f52340p0 &= -2;
                    } else {
                        if ((this.f52340p0 & 1) != 1) {
                            this.f52341q0 = new ArrayList(this.f52341q0);
                            this.f52340p0 |= 1;
                        }
                        this.f52341q0.addAll(r6.f52333p0);
                    }
                }
                if (!r6.f52334q0.isEmpty()) {
                    if (this.f52342r0.isEmpty()) {
                        this.f52342r0 = r6.f52334q0;
                        this.f52340p0 &= -3;
                    } else {
                        if ((this.f52340p0 & 2) != 2) {
                            this.f52342r0 = new ArrayList(this.f52342r0);
                            this.f52340p0 |= 2;
                        }
                        this.f52342r0.addAll(r6.f52334q0);
                    }
                }
                if (!r6.f52335r0.isEmpty()) {
                    if (this.f52343s0.isEmpty()) {
                        this.f52343s0 = r6.f52335r0;
                        this.f52340p0 &= -5;
                    } else {
                        if ((this.f52340p0 & 4) != 4) {
                            this.f52343s0 = new ArrayList(this.f52343s0);
                            this.f52340p0 |= 4;
                        }
                        this.f52343s0.addAll(r6.f52335r0);
                    }
                }
                if (r6.hasTypeTable()) {
                    mergeTypeTable(r6.getTypeTable());
                }
                if (r6.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r6.getVersionRequirementTable());
                }
                m18283a(r6);
                setUnknownFields(getUnknownFields().concat(r6.f52331Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Package r6 = null;
                try {
                    try {
                        Package partialFrom = Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Package r10 = (Package) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            r6 = r10;
                            if (r6 != null) {
                                mergeFrom(r6);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r6 != null) {
                        mergeFrom(r6);
                    }
                    throw th;
                }
            }
        }

        static {
            Package r6 = new Package();
            f52330w0 = r6;
            r6.f52333p0 = Collections.emptyList();
            r6.f52334q0 = Collections.emptyList();
            r6.f52335r0 = Collections.emptyList();
            r6.f52336s0 = TypeTable.getDefaultInstance();
            r6.f52337t0 = VersionRequirementTable.getDefaultInstance();
        }

        public Package(Builder builder) {
            super(builder);
            this.f52338u0 = (byte) -1;
            this.f52339v0 = -1;
            this.f52331Z = builder.getUnknownFields();
        }

        public static Package getDefaultInstance() {
            return f52330w0;
        }

        public static Builder newBuilder(Package r6) {
            return newBuilder().mergeFrom(r6);
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Function getFunction(int i10) {
            return (Function) this.f52333p0.get(i10);
        }

        public int getFunctionCount() {
            return this.f52333p0.size();
        }

        public List<Function> getFunctionList() {
            return this.f52333p0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i10) {
            return (Property) this.f52334q0.get(i10);
        }

        public int getPropertyCount() {
            return this.f52334q0.size();
        }

        public List<Property> getPropertyList() {
            return this.f52334q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52339v0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f52333p0.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f52333p0.get(i11));
            }
            for (int i12 = 0; i12 < this.f52334q0.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f52334q0.get(i12));
            }
            for (int i13 = 0; i13 < this.f52335r0.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f52335r0.get(i13));
            }
            if ((this.f52332o0 & 1) == 1) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.f52336s0);
            }
            if ((this.f52332o0 & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(32, this.f52337t0);
            }
            int size = this.f52331Z.size() + m18284a() + iComputeMessageSize;
            this.f52339v0 = size;
            return size;
        }

        public TypeAlias getTypeAlias(int i10) {
            return (TypeAlias) this.f52335r0.get(i10);
        }

        public int getTypeAliasCount() {
            return this.f52335r0.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.f52335r0;
        }

        public TypeTable getTypeTable() {
            return this.f52336s0;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.f52337t0;
        }

        public boolean hasTypeTable() {
            return (this.f52332o0 & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.f52332o0 & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52338u0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getFunctionCount(); i10++) {
                if (!getFunction(i10).isInitialized()) {
                    this.f52338u0 = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < getPropertyCount(); i11++) {
                if (!getProperty(i11).isInitialized()) {
                    this.f52338u0 = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getTypeAliasCount(); i12++) {
                if (!getTypeAlias(i12).isInitialized()) {
                    this.f52338u0 = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.f52338u0 = (byte) 0;
                return false;
            }
            if (this.f52735Y.m18301f()) {
                this.f52338u0 = (byte) 1;
                return true;
            }
            this.f52338u0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            for (int i10 = 0; i10 < this.f52333p0.size(); i10++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f52333p0.get(i10));
            }
            for (int i11 = 0; i11 < this.f52334q0.size(); i11++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f52334q0.get(i11));
            }
            for (int i12 = 0; i12 < this.f52335r0.size(); i12++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f52335r0.get(i12));
            }
            if ((this.f52332o0 & 1) == 1) {
                codedOutputStream.writeMessage(30, this.f52336s0);
            }
            if ((this.f52332o0 & 2) == 2) {
                codedOutputStream.writeMessage(32, this.f52337t0);
            }
            extensionWriter.writeUntil(RCHTTPStatusCodes.SUCCESS, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52331Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Package getDefaultInstanceForType() {
            return f52330w0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Package() {
            this.f52338u0 = (byte) -1;
            this.f52339v0 = -1;
            this.f52331Z = ByteString.EMPTY;
        }

        public Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52338u0 = (byte) -1;
            this.f52339v0 = -1;
            this.f52333p0 = Collections.emptyList();
            this.f52334q0 = Collections.emptyList();
            this.f52335r0 = Collections.emptyList();
            this.f52336s0 = TypeTable.getDefaultInstance();
            this.f52337t0 = VersionRequirementTable.getDefaultInstance();
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
                                if (tag == 26) {
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 != 1) {
                                        this.f52333p0 = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.f52333p0.add(codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                                } else if (tag == 34) {
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 != 2) {
                                        this.f52334q0 = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.f52334q0.add(codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                                } else if (tag != 42) {
                                    if (tag == 242) {
                                        TypeTable.Builder builder = (this.f52332o0 & 1) == 1 ? this.f52336s0.toBuilder() : null;
                                        TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                        this.f52336s0 = typeTable;
                                        if (builder != null) {
                                            builder.mergeFrom(typeTable);
                                            this.f52336s0 = builder.buildPartial();
                                        }
                                        this.f52332o0 |= 1;
                                    } else if (tag != 258) {
                                        if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        VersionRequirementTable.Builder builder2 = (this.f52332o0 & 2) == 2 ? this.f52337t0.toBuilder() : null;
                                        VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                        this.f52337t0 = versionRequirementTable;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(versionRequirementTable);
                                            this.f52337t0 = builder2.buildPartial();
                                        }
                                        this.f52332o0 |= 2;
                                    }
                                } else {
                                    int i13 = (i10 == true ? 1 : 0) & 4;
                                    i10 = i10;
                                    if (i13 != 4) {
                                        this.f52335r0 = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.f52335r0.add(codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
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
                    if (((i10 == true ? 1 : 0) & 1) == 1) {
                        this.f52333p0 = DesugarCollections.unmodifiableList(this.f52333p0);
                    }
                    if (((i10 == true ? 1 : 0) & 2) == 2) {
                        this.f52334q0 = DesugarCollections.unmodifiableList(this.f52334q0);
                    }
                    if (((i10 == true ? 1 : 0) & 4) == 4) {
                        this.f52335r0 = DesugarCollections.unmodifiableList(this.f52335r0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52331Z = outputNewOutput.toByteString();
                    }
                    m18285b();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) == 1) {
                this.f52333p0 = DesugarCollections.unmodifiableList(this.f52333p0);
            }
            if (((i10 == true ? 1 : 0) & 2) == 2) {
                this.f52334q0 = DesugarCollections.unmodifiableList(this.f52334q0);
            }
            if (((i10 == true ? 1 : 0) & 4) == 4) {
                this.f52335r0 = DesugarCollections.unmodifiableList(this.f52335r0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52331Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new C16591l();

        /* JADX INFO: renamed from: v0 */
        public static final PackageFragment f52346v0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52347Z;

        /* JADX INFO: renamed from: o0 */
        public int f52348o0;

        /* JADX INFO: renamed from: p0 */
        public StringTable f52349p0;

        /* JADX INFO: renamed from: q0 */
        public QualifiedNameTable f52350q0;

        /* JADX INFO: renamed from: r0 */
        public Package f52351r0;

        /* JADX INFO: renamed from: s0 */
        public List f52352s0;

        /* JADX INFO: renamed from: t0 */
        public byte f52353t0;

        /* JADX INFO: renamed from: u0 */
        public int f52354u0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {

            /* JADX INFO: renamed from: p0 */
            public int f52355p0;

            /* JADX INFO: renamed from: q0 */
            public StringTable f52356q0 = StringTable.getDefaultInstance();

            /* JADX INFO: renamed from: r0 */
            public QualifiedNameTable f52357r0 = QualifiedNameTable.getDefaultInstance();

            /* JADX INFO: renamed from: s0 */
            public Package f52358s0 = Package.getDefaultInstance();

            /* JADX INFO: renamed from: t0 */
            public List f52359t0 = Collections.emptyList();

            public PackageFragment buildPartial() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i10 = this.f52355p0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                packageFragment.f52349p0 = this.f52356q0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                packageFragment.f52350q0 = this.f52357r0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                packageFragment.f52351r0 = this.f52358s0;
                if ((i10 & 8) == 8) {
                    this.f52359t0 = DesugarCollections.unmodifiableList(this.f52359t0);
                    this.f52355p0 &= -9;
                }
                packageFragment.f52352s0 = this.f52359t0;
                packageFragment.f52348o0 = i11;
                return packageFragment;
            }

            public Class getClass_(int i10) {
                return (Class) this.f52359t0.get(i10);
            }

            public int getClass_Count() {
                return this.f52359t0.size();
            }

            public Package getPackage() {
                return this.f52358s0;
            }

            public QualifiedNameTable getQualifiedNames() {
                return this.f52357r0;
            }

            public boolean hasPackage() {
                return (this.f52355p0 & 4) == 4;
            }

            public boolean hasQualifiedNames() {
                return (this.f52355p0 & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getClass_Count(); i10++) {
                    if (!getClass_(i10).isInitialized()) {
                        return false;
                    }
                }
                return this.f52733Z.m18301f();
            }

            public Builder mergePackage(Package r6) {
                if ((this.f52355p0 & 4) != 4 || this.f52358s0 == Package.getDefaultInstance()) {
                    this.f52358s0 = r6;
                } else {
                    this.f52358s0 = Package.newBuilder(this.f52358s0).mergeFrom(r6).buildPartial();
                }
                this.f52355p0 |= 4;
                return this;
            }

            public Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                if ((this.f52355p0 & 2) != 2 || this.f52357r0 == QualifiedNameTable.getDefaultInstance()) {
                    this.f52357r0 = qualifiedNameTable;
                } else {
                    this.f52357r0 = QualifiedNameTable.newBuilder(this.f52357r0).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.f52355p0 |= 2;
                return this;
            }

            public Builder mergeStrings(StringTable stringTable) {
                if ((this.f52355p0 & 1) != 1 || this.f52356q0 == StringTable.getDefaultInstance()) {
                    this.f52356q0 = stringTable;
                } else {
                    this.f52356q0 = StringTable.newBuilder(this.f52356q0).mergeFrom(stringTable).buildPartial();
                }
                this.f52355p0 |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public PackageFragment build() {
                PackageFragment packageFragmentBuildPartial = buildPartial();
                if (packageFragmentBuildPartial.isInitialized()) {
                    return packageFragmentBuildPartial;
                }
                throw new UninitializedMessageException(packageFragmentBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.f52352s0.isEmpty()) {
                    if (this.f52359t0.isEmpty()) {
                        this.f52359t0 = packageFragment.f52352s0;
                        this.f52355p0 &= -9;
                    } else {
                        if ((this.f52355p0 & 8) != 8) {
                            this.f52359t0 = new ArrayList(this.f52359t0);
                            this.f52355p0 |= 8;
                        }
                        this.f52359t0.addAll(packageFragment.f52352s0);
                    }
                }
                m18283a(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.f52347Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        PackageFragment partialFrom = PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        PackageFragment packageFragment2 = (PackageFragment) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                mergeFrom(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (packageFragment != null) {
                        mergeFrom(packageFragment);
                    }
                    throw th;
                }
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment();
            f52346v0 = packageFragment;
            packageFragment.f52349p0 = StringTable.getDefaultInstance();
            packageFragment.f52350q0 = QualifiedNameTable.getDefaultInstance();
            packageFragment.f52351r0 = Package.getDefaultInstance();
            packageFragment.f52352s0 = Collections.emptyList();
        }

        public PackageFragment(Builder builder) {
            super(builder);
            this.f52353t0 = (byte) -1;
            this.f52354u0 = -1;
            this.f52347Z = builder.getUnknownFields();
        }

        public static PackageFragment getDefaultInstance() {
            return f52346v0;
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Class getClass_(int i10) {
            return (Class) this.f52352s0.get(i10);
        }

        public int getClass_Count() {
            return this.f52352s0.size();
        }

        public List<Class> getClass_List() {
            return this.f52352s0;
        }

        public Package getPackage() {
            return this.f52351r0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.f52350q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52354u0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = (this.f52348o0 & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.f52349p0) : 0;
            if ((this.f52348o0 & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.f52350q0);
            }
            if ((this.f52348o0 & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f52351r0);
            }
            for (int i11 = 0; i11 < this.f52352s0.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f52352s0.get(i11));
            }
            int size = this.f52347Z.size() + m18284a() + iComputeMessageSize;
            this.f52354u0 = size;
            return size;
        }

        public StringTable getStrings() {
            return this.f52349p0;
        }

        public boolean hasPackage() {
            return (this.f52348o0 & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.f52348o0 & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.f52348o0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52353t0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.f52353t0 = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.f52353t0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getClass_Count(); i10++) {
                if (!getClass_(i10).isInitialized()) {
                    this.f52353t0 = (byte) 0;
                    return false;
                }
            }
            if (this.f52735Y.m18301f()) {
                this.f52353t0 = (byte) 1;
                return true;
            }
            this.f52353t0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52348o0 & 1) == 1) {
                codedOutputStream.writeMessage(1, this.f52349p0);
            }
            if ((this.f52348o0 & 2) == 2) {
                codedOutputStream.writeMessage(2, this.f52350q0);
            }
            if ((this.f52348o0 & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f52351r0);
            }
            for (int i10 = 0; i10 < this.f52352s0.size(); i10++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f52352s0.get(i10));
            }
            extensionWriter.writeUntil(RCHTTPStatusCodes.SUCCESS, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52347Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public PackageFragment getDefaultInstanceForType() {
            return f52346v0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public PackageFragment() {
            this.f52353t0 = (byte) -1;
            this.f52354u0 = -1;
            this.f52347Z = ByteString.EMPTY;
        }

        public PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52353t0 = (byte) -1;
            this.f52354u0 = -1;
            this.f52349p0 = StringTable.getDefaultInstance();
            this.f52350q0 = QualifiedNameTable.getDefaultInstance();
            this.f52351r0 = Package.getDefaultInstance();
            this.f52352s0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            char c9 = 0;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                StringTable.Builder builder = (this.f52348o0 & 1) == 1 ? this.f52349p0.toBuilder() : null;
                                StringTable stringTable = (StringTable) codedInputStream.readMessage(StringTable.PARSER, extensionRegistryLite);
                                this.f52349p0 = stringTable;
                                if (builder != null) {
                                    builder.mergeFrom(stringTable);
                                    this.f52349p0 = builder.buildPartial();
                                }
                                this.f52348o0 |= 1;
                            } else if (tag == 18) {
                                QualifiedNameTable.Builder builder2 = (this.f52348o0 & 2) == 2 ? this.f52350q0.toBuilder() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.readMessage(QualifiedNameTable.PARSER, extensionRegistryLite);
                                this.f52350q0 = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.mergeFrom(qualifiedNameTable);
                                    this.f52350q0 = builder2.buildPartial();
                                }
                                this.f52348o0 |= 2;
                            } else if (tag == 26) {
                                Package.Builder builder3 = (this.f52348o0 & 4) == 4 ? this.f52351r0.toBuilder() : null;
                                Package r6 = (Package) codedInputStream.readMessage(Package.PARSER, extensionRegistryLite);
                                this.f52351r0 = r6;
                                if (builder3 != null) {
                                    builder3.mergeFrom(r6);
                                    this.f52351r0 = builder3.buildPartial();
                                }
                                this.f52348o0 |= 4;
                            } else if (tag != 34) {
                                if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i10 = (c9 == true ? 1 : 0) & '\b';
                                c9 = c9;
                                if (i10 != 8) {
                                    this.f52352s0 = new ArrayList();
                                    c9 = '\b';
                                }
                                this.f52352s0.add(codedInputStream.readMessage(Class.PARSER, extensionRegistryLite));
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        if (((c9 == true ? 1 : 0) & '\b') == 8) {
                            this.f52352s0 = DesugarCollections.unmodifiableList(this.f52352s0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52347Z = outputNewOutput.toByteString();
                        }
                        m18285b();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (((c9 == true ? 1 : 0) & '\b') == 8) {
                this.f52352s0 = DesugarCollections.unmodifiableList(this.f52352s0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52347Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {

        /* JADX INFO: renamed from: G0 */
        public static final Property f52360G0;
        public static Parser<Property> PARSER = new C16592m();

        /* JADX INFO: renamed from: A0 */
        public ValueParameter f52361A0;

        /* JADX INFO: renamed from: B0 */
        public int f52362B0;

        /* JADX INFO: renamed from: C0 */
        public int f52363C0;

        /* JADX INFO: renamed from: D0 */
        public List f52364D0;

        /* JADX INFO: renamed from: E0 */
        public byte f52365E0;

        /* JADX INFO: renamed from: F0 */
        public int f52366F0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52367Z;

        /* JADX INFO: renamed from: o0 */
        public int f52368o0;

        /* JADX INFO: renamed from: p0 */
        public int f52369p0;

        /* JADX INFO: renamed from: q0 */
        public int f52370q0;

        /* JADX INFO: renamed from: r0 */
        public int f52371r0;

        /* JADX INFO: renamed from: s0 */
        public Type f52372s0;

        /* JADX INFO: renamed from: t0 */
        public int f52373t0;

        /* JADX INFO: renamed from: u0 */
        public List f52374u0;

        /* JADX INFO: renamed from: v0 */
        public Type f52375v0;

        /* JADX INFO: renamed from: w0 */
        public int f52376w0;

        /* JADX INFO: renamed from: x0 */
        public List f52377x0;

        /* JADX INFO: renamed from: y0 */
        public List f52378y0;

        /* JADX INFO: renamed from: z0 */
        public int f52379z0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {

            /* JADX INFO: renamed from: B0 */
            public int f52381B0;

            /* JADX INFO: renamed from: C0 */
            public int f52382C0;

            /* JADX INFO: renamed from: p0 */
            public int f52384p0;

            /* JADX INFO: renamed from: s0 */
            public int f52387s0;

            /* JADX INFO: renamed from: u0 */
            public int f52389u0;

            /* JADX INFO: renamed from: x0 */
            public int f52392x0;

            /* JADX INFO: renamed from: q0 */
            public int f52385q0 = 518;

            /* JADX INFO: renamed from: r0 */
            public int f52386r0 = TokenTypes.ACK;

            /* JADX INFO: renamed from: t0 */
            public Type f52388t0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: v0 */
            public List f52390v0 = Collections.emptyList();

            /* JADX INFO: renamed from: w0 */
            public Type f52391w0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: y0 */
            public List f52393y0 = Collections.emptyList();

            /* JADX INFO: renamed from: z0 */
            public List f52394z0 = Collections.emptyList();

            /* JADX INFO: renamed from: A0 */
            public ValueParameter f52380A0 = ValueParameter.getDefaultInstance();

            /* JADX INFO: renamed from: D0 */
            public List f52383D0 = Collections.emptyList();

            public Property buildPartial() {
                Property property = new Property(this);
                int i10 = this.f52384p0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                property.f52369p0 = this.f52385q0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                property.f52370q0 = this.f52386r0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                property.f52371r0 = this.f52387s0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                property.f52372s0 = this.f52388t0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                property.f52373t0 = this.f52389u0;
                if ((i10 & 32) == 32) {
                    this.f52390v0 = DesugarCollections.unmodifiableList(this.f52390v0);
                    this.f52384p0 &= -33;
                }
                property.f52374u0 = this.f52390v0;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                property.f52375v0 = this.f52391w0;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                property.f52376w0 = this.f52392x0;
                if ((this.f52384p0 & 256) == 256) {
                    this.f52393y0 = DesugarCollections.unmodifiableList(this.f52393y0);
                    this.f52384p0 &= -257;
                }
                property.f52377x0 = this.f52393y0;
                if ((this.f52384p0 & 512) == 512) {
                    this.f52394z0 = DesugarCollections.unmodifiableList(this.f52394z0);
                    this.f52384p0 &= -513;
                }
                property.f52378y0 = this.f52394z0;
                if ((i10 & 1024) == 1024) {
                    i11 |= 128;
                }
                property.f52361A0 = this.f52380A0;
                if ((i10 & 2048) == 2048) {
                    i11 |= 256;
                }
                property.f52362B0 = this.f52381B0;
                if ((i10 & 4096) == 4096) {
                    i11 |= 512;
                }
                property.f52363C0 = this.f52382C0;
                if ((this.f52384p0 & 8192) == 8192) {
                    this.f52383D0 = DesugarCollections.unmodifiableList(this.f52383D0);
                    this.f52384p0 &= -8193;
                }
                property.f52364D0 = this.f52383D0;
                property.f52368o0 = i11;
                return property;
            }

            public Type getContextReceiverType(int i10) {
                return (Type) this.f52393y0.get(i10);
            }

            public int getContextReceiverTypeCount() {
                return this.f52393y0.size();
            }

            public Type getReceiverType() {
                return this.f52391w0;
            }

            public Type getReturnType() {
                return this.f52388t0;
            }

            public ValueParameter getSetterValueParameter() {
                return this.f52380A0;
            }

            public TypeParameter getTypeParameter(int i10) {
                return (TypeParameter) this.f52390v0.get(i10);
            }

            public int getTypeParameterCount() {
                return this.f52390v0.size();
            }

            public boolean hasName() {
                return (this.f52384p0 & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.f52384p0 & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.f52384p0 & 8) == 8;
            }

            public boolean hasSetterValueParameter() {
                return (this.f52384p0 & 1024) == 1024;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                    if (!getTypeParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getContextReceiverTypeCount(); i11++) {
                    if (!getContextReceiverType(i11).isInitialized()) {
                        return false;
                    }
                }
                return (!hasSetterValueParameter() || getSetterValueParameter().isInitialized()) && this.f52733Z.m18301f();
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.f52384p0 & 64) != 64 || this.f52391w0 == Type.getDefaultInstance()) {
                    this.f52391w0 = type;
                } else {
                    this.f52391w0 = Type.newBuilder(this.f52391w0).mergeFrom(type).buildPartial();
                }
                this.f52384p0 |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.f52384p0 & 8) != 8 || this.f52388t0 == Type.getDefaultInstance()) {
                    this.f52388t0 = type;
                } else {
                    this.f52388t0 = Type.newBuilder(this.f52388t0).mergeFrom(type).buildPartial();
                }
                this.f52384p0 |= 8;
                return this;
            }

            public Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                if ((this.f52384p0 & 1024) != 1024 || this.f52380A0 == ValueParameter.getDefaultInstance()) {
                    this.f52380A0 = valueParameter;
                } else {
                    this.f52380A0 = ValueParameter.newBuilder(this.f52380A0).mergeFrom(valueParameter).buildPartial();
                }
                this.f52384p0 |= 1024;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f52384p0 |= 1;
                this.f52385q0 = i10;
                return this;
            }

            public Builder setGetterFlags(int i10) {
                this.f52384p0 |= 2048;
                this.f52381B0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f52384p0 |= 4;
                this.f52387s0 = i10;
                return this;
            }

            public Builder setOldFlags(int i10) {
                this.f52384p0 |= 2;
                this.f52386r0 = i10;
                return this;
            }

            public Builder setReceiverTypeId(int i10) {
                this.f52384p0 |= 128;
                this.f52392x0 = i10;
                return this;
            }

            public Builder setReturnTypeId(int i10) {
                this.f52384p0 |= 16;
                this.f52389u0 = i10;
                return this;
            }

            public Builder setSetterFlags(int i10) {
                this.f52384p0 |= 4096;
                this.f52382C0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Property build() {
                Property propertyBuildPartial = buildPartial();
                if (propertyBuildPartial.isInitialized()) {
                    return propertyBuildPartial;
                }
                throw new UninitializedMessageException(propertyBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.f52374u0.isEmpty()) {
                    if (this.f52390v0.isEmpty()) {
                        this.f52390v0 = property.f52374u0;
                        this.f52384p0 &= -33;
                    } else {
                        if ((this.f52384p0 & 32) != 32) {
                            this.f52390v0 = new ArrayList(this.f52390v0);
                            this.f52384p0 |= 32;
                        }
                        this.f52390v0.addAll(property.f52374u0);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (!property.f52377x0.isEmpty()) {
                    if (this.f52393y0.isEmpty()) {
                        this.f52393y0 = property.f52377x0;
                        this.f52384p0 &= -257;
                    } else {
                        if ((this.f52384p0 & 256) != 256) {
                            this.f52393y0 = new ArrayList(this.f52393y0);
                            this.f52384p0 |= 256;
                        }
                        this.f52393y0.addAll(property.f52377x0);
                    }
                }
                if (!property.f52378y0.isEmpty()) {
                    if (this.f52394z0.isEmpty()) {
                        this.f52394z0 = property.f52378y0;
                        this.f52384p0 &= -513;
                    } else {
                        if ((this.f52384p0 & 512) != 512) {
                            this.f52394z0 = new ArrayList(this.f52394z0);
                            this.f52384p0 |= 512;
                        }
                        this.f52394z0.addAll(property.f52378y0);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.f52364D0.isEmpty()) {
                    if (this.f52383D0.isEmpty()) {
                        this.f52383D0 = property.f52364D0;
                        this.f52384p0 &= -8193;
                    } else {
                        if ((this.f52384p0 & 8192) != 8192) {
                            this.f52383D0 = new ArrayList(this.f52383D0);
                            this.f52384p0 |= 8192;
                        }
                        this.f52383D0.addAll(property.f52364D0);
                    }
                }
                m18283a(property);
                setUnknownFields(getUnknownFields().concat(property.f52367Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Property property = null;
                try {
                    try {
                        Property partialFrom = Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Property property2 = (Property) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            property = property2;
                            if (property != null) {
                                mergeFrom(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (property != null) {
                        mergeFrom(property);
                    }
                    throw th;
                }
            }
        }

        static {
            Property property = new Property();
            f52360G0 = property;
            property.m18253e();
        }

        public Property(Builder builder) {
            super(builder);
            this.f52379z0 = -1;
            this.f52365E0 = (byte) -1;
            this.f52366F0 = -1;
            this.f52367Z = builder.getUnknownFields();
        }

        public static Property getDefaultInstance() {
            return f52360G0;
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mergeFrom(property);
        }

        /* JADX INFO: renamed from: e */
        public final void m18253e() {
            this.f52369p0 = 518;
            this.f52370q0 = TokenTypes.ACK;
            this.f52371r0 = 0;
            this.f52372s0 = Type.getDefaultInstance();
            this.f52373t0 = 0;
            this.f52374u0 = Collections.emptyList();
            this.f52375v0 = Type.getDefaultInstance();
            this.f52376w0 = 0;
            this.f52377x0 = Collections.emptyList();
            this.f52378y0 = Collections.emptyList();
            this.f52361A0 = ValueParameter.getDefaultInstance();
            this.f52362B0 = 0;
            this.f52363C0 = 0;
            this.f52364D0 = Collections.emptyList();
        }

        public Type getContextReceiverType(int i10) {
            return (Type) this.f52377x0.get(i10);
        }

        public int getContextReceiverTypeCount() {
            return this.f52377x0.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.f52378y0;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.f52377x0;
        }

        public int getFlags() {
            return this.f52369p0;
        }

        public int getGetterFlags() {
            return this.f52362B0;
        }

        public int getName() {
            return this.f52371r0;
        }

        public int getOldFlags() {
            return this.f52370q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.f52375v0;
        }

        public int getReceiverTypeId() {
            return this.f52376w0;
        }

        public Type getReturnType() {
            return this.f52372s0;
        }

        public int getReturnTypeId() {
            return this.f52373t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52366F0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52368o0 & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.f52370q0) : 0;
            if ((this.f52368o0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52371r0);
            }
            if ((this.f52368o0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f52372s0);
            }
            for (int i11 = 0; i11 < this.f52374u0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f52374u0.get(i11));
            }
            if ((this.f52368o0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f52375v0);
            }
            if ((this.f52368o0 & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.f52361A0);
            }
            if ((this.f52368o0 & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f52362B0);
            }
            if ((this.f52368o0 & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.f52363C0);
            }
            if ((this.f52368o0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.f52373t0);
            }
            if ((this.f52368o0 & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, this.f52376w0);
            }
            if ((this.f52368o0 & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.f52369p0);
            }
            for (int i12 = 0; i12 < this.f52377x0.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(12, (MessageLite) this.f52377x0.get(i12));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i13 = 0; i13 < this.f52378y0.size(); i13++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52378y0.get(i13)).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f52379z0 = iComputeInt32SizeNoTag;
            int iComputeInt32SizeNoTag3 = 0;
            for (int i14 = 0; i14 < this.f52364D0.size(); i14++) {
                iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52364D0.get(i14)).intValue());
            }
            int size = this.f52367Z.size() + m18284a() + (getVersionRequirementList().size() * 2) + iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3;
            this.f52366F0 = size;
            return size;
        }

        public int getSetterFlags() {
            return this.f52363C0;
        }

        public ValueParameter getSetterValueParameter() {
            return this.f52361A0;
        }

        public TypeParameter getTypeParameter(int i10) {
            return (TypeParameter) this.f52374u0.get(i10);
        }

        public int getTypeParameterCount() {
            return this.f52374u0.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f52374u0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f52364D0;
        }

        public boolean hasFlags() {
            return (this.f52368o0 & 1) == 1;
        }

        public boolean hasGetterFlags() {
            return (this.f52368o0 & 256) == 256;
        }

        public boolean hasName() {
            return (this.f52368o0 & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.f52368o0 & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.f52368o0 & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.f52368o0 & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.f52368o0 & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.f52368o0 & 16) == 16;
        }

        public boolean hasSetterFlags() {
            return (this.f52368o0 & 512) == 512;
        }

        public boolean hasSetterValueParameter() {
            return (this.f52368o0 & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52365E0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.f52365E0 = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.f52365E0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                if (!getTypeParameter(i10).isInitialized()) {
                    this.f52365E0 = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.f52365E0 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getContextReceiverTypeCount(); i11++) {
                if (!getContextReceiverType(i11).isInitialized()) {
                    this.f52365E0 = (byte) 0;
                    return false;
                }
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.f52365E0 = (byte) 0;
                return false;
            }
            if (this.f52735Y.m18301f()) {
                this.f52365E0 = (byte) 1;
                return true;
            }
            this.f52365E0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52368o0 & 2) == 2) {
                codedOutputStream.writeInt32(1, this.f52370q0);
            }
            if ((this.f52368o0 & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f52371r0);
            }
            if ((this.f52368o0 & 8) == 8) {
                codedOutputStream.writeMessage(3, this.f52372s0);
            }
            for (int i10 = 0; i10 < this.f52374u0.size(); i10++) {
                codedOutputStream.writeMessage(4, (MessageLite) this.f52374u0.get(i10));
            }
            if ((this.f52368o0 & 32) == 32) {
                codedOutputStream.writeMessage(5, this.f52375v0);
            }
            if ((this.f52368o0 & 128) == 128) {
                codedOutputStream.writeMessage(6, this.f52361A0);
            }
            if ((this.f52368o0 & 256) == 256) {
                codedOutputStream.writeInt32(7, this.f52362B0);
            }
            if ((this.f52368o0 & 512) == 512) {
                codedOutputStream.writeInt32(8, this.f52363C0);
            }
            if ((this.f52368o0 & 16) == 16) {
                codedOutputStream.writeInt32(9, this.f52373t0);
            }
            if ((this.f52368o0 & 64) == 64) {
                codedOutputStream.writeInt32(10, this.f52376w0);
            }
            if ((this.f52368o0 & 1) == 1) {
                codedOutputStream.writeInt32(11, this.f52369p0);
            }
            for (int i11 = 0; i11 < this.f52377x0.size(); i11++) {
                codedOutputStream.writeMessage(12, (MessageLite) this.f52377x0.get(i11));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(106);
                codedOutputStream.writeRawVarint32(this.f52379z0);
            }
            for (int i12 = 0; i12 < this.f52378y0.size(); i12++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52378y0.get(i12)).intValue());
            }
            for (int i13 = 0; i13 < this.f52364D0.size(); i13++) {
                codedOutputStream.writeInt32(31, ((Integer) this.f52364D0.get(i13)).intValue());
            }
            extensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52367Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Property getDefaultInstanceForType() {
            return f52360G0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Property() {
            this.f52379z0 = -1;
            this.f52365E0 = (byte) -1;
            this.f52366F0 = -1;
            this.f52367Z = ByteString.EMPTY;
        }

        public Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52379z0 = -1;
            this.f52365E0 = (byte) -1;
            this.f52366F0 = -1;
            m18253e();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            int i10 = 0;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f52368o0 |= 2;
                                this.f52370q0 = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.f52368o0 |= 4;
                                this.f52371r0 = codedInputStream.readInt32();
                                continue;
                            case 26:
                                Type.Builder builder = (this.f52368o0 & 8) == 8 ? this.f52372s0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f52372s0 = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f52372s0 = builder.buildPartial();
                                }
                                this.f52368o0 |= 8;
                                continue;
                            case 34:
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f52374u0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f52374u0.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 42:
                                Type.Builder builder2 = (this.f52368o0 & 32) == 32 ? this.f52375v0.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f52375v0 = type2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(type2);
                                    this.f52375v0 = builder2.buildPartial();
                                }
                                this.f52368o0 |= 32;
                                continue;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                ValueParameter.Builder builder3 = (this.f52368o0 & 128) == 128 ? this.f52361A0.toBuilder() : null;
                                ValueParameter valueParameter = (ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite);
                                this.f52361A0 = valueParameter;
                                if (builder3 != null) {
                                    builder3.mergeFrom(valueParameter);
                                    this.f52361A0 = builder3.buildPartial();
                                }
                                this.f52368o0 |= 128;
                                continue;
                            case 56:
                                this.f52368o0 |= 256;
                                this.f52362B0 = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.f52368o0 |= 512;
                                this.f52363C0 = codedInputStream.readInt32();
                                continue;
                            case 72:
                                this.f52368o0 |= 16;
                                this.f52373t0 = codedInputStream.readInt32();
                                continue;
                            case 80:
                                this.f52368o0 |= 64;
                                this.f52376w0 = codedInputStream.readInt32();
                                continue;
                            case 88:
                                this.f52368o0 |= 1;
                                this.f52369p0 = codedInputStream.readInt32();
                                continue;
                            case 98:
                                int i12 = (i10 == true ? 1 : 0) & 256;
                                i10 = i10;
                                if (i12 != 256) {
                                    this.f52377x0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 256;
                                }
                                this.f52377x0.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                continue;
                            case 104:
                                int i13 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i13 != 512) {
                                    this.f52378y0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                this.f52378y0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 106:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i14 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i14 != 512 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i10 = i10;
                                    this.f52378y0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                i10 = i10;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52378y0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            case 248:
                                int i15 = (i10 == true ? 1 : 0) & 8192;
                                i10 = i10;
                                if (i15 != 8192) {
                                    this.f52364D0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8192;
                                }
                                this.f52364D0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 250:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i16 = (i10 == true ? 1 : 0) & 8192;
                                i10 = i10;
                                if (i16 != 8192 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i10 = i10;
                                    this.f52364D0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8192;
                                }
                                i10 = i10;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52364D0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                continue;
                            default:
                                if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f52374u0 = DesugarCollections.unmodifiableList(this.f52374u0);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == 256) {
                        this.f52377x0 = DesugarCollections.unmodifiableList(this.f52377x0);
                    }
                    if (((i10 == true ? 1 : 0) & 512) == 512) {
                        this.f52378y0 = DesugarCollections.unmodifiableList(this.f52378y0);
                    }
                    if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f52364D0 = DesugarCollections.unmodifiableList(this.f52364D0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52367Z = outputNewOutput.toByteString();
                    }
                    m18285b();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 32) == 32) {
                this.f52374u0 = DesugarCollections.unmodifiableList(this.f52374u0);
            }
            if (((i10 == true ? 1 : 0) & 256) == 256) {
                this.f52377x0 = DesugarCollections.unmodifiableList(this.f52377x0);
            }
            if (((i10 == true ? 1 : 0) & 512) == 512) {
                this.f52378y0 = DesugarCollections.unmodifiableList(this.f52378y0);
            }
            if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                this.f52364D0 = DesugarCollections.unmodifiableList(this.f52364D0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52367Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new C16593n();

        /* JADX INFO: renamed from: q0 */
        public static final QualifiedNameTable f52395q0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52396Y;

        /* JADX INFO: renamed from: Z */
        public List f52397Z;

        /* JADX INFO: renamed from: o0 */
        public byte f52398o0;

        /* JADX INFO: renamed from: p0 */
        public int f52399p0;

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52400Z;

            /* JADX INFO: renamed from: o0 */
            public List f52401o0 = Collections.emptyList();

            public QualifiedNameTable buildPartial() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f52400Z & 1) == 1) {
                    this.f52401o0 = DesugarCollections.unmodifiableList(this.f52401o0);
                    this.f52400Z &= -2;
                }
                qualifiedNameTable.f52397Z = this.f52401o0;
                return qualifiedNameTable;
            }

            public QualifiedName getQualifiedName(int i10) {
                return (QualifiedName) this.f52401o0.get(i10);
            }

            public int getQualifiedNameCount() {
                return this.f52401o0.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getQualifiedNameCount(); i10++) {
                    if (!getQualifiedName(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableBuildPartial = buildPartial();
                if (qualifiedNameTableBuildPartial.isInitialized()) {
                    return qualifiedNameTableBuildPartial;
                }
                throw new UninitializedMessageException(qualifiedNameTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.f52397Z.isEmpty()) {
                    if (this.f52401o0.isEmpty()) {
                        this.f52401o0 = qualifiedNameTable.f52397Z;
                        this.f52400Z &= -2;
                    } else {
                        if ((this.f52400Z & 1) != 1) {
                            this.f52401o0 = new ArrayList(this.f52401o0);
                            this.f52400Z |= 1;
                        }
                        this.f52401o0.addAll(qualifiedNameTable.f52397Z);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.f52396Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        QualifiedNameTable partialFrom = QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                mergeFrom(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (qualifiedNameTable != null) {
                        mergeFrom(qualifiedNameTable);
                    }
                    throw th;
                }
            }
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new C16594o();

            /* JADX INFO: renamed from: t0 */
            public static final QualifiedName f52402t0;

            /* JADX INFO: renamed from: Y */
            public final ByteString f52403Y;

            /* JADX INFO: renamed from: Z */
            public int f52404Z;

            /* JADX INFO: renamed from: o0 */
            public int f52405o0;

            /* JADX INFO: renamed from: p0 */
            public int f52406p0;

            /* JADX INFO: renamed from: q0 */
            public Kind f52407q0;

            /* JADX INFO: renamed from: r0 */
            public byte f52408r0;

            /* JADX INFO: renamed from: s0 */
            public int f52409s0;

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* JADX INFO: renamed from: Z */
                public int f52410Z;

                /* JADX INFO: renamed from: p0 */
                public int f52412p0;

                /* JADX INFO: renamed from: o0 */
                public int f52411o0 = -1;

                /* JADX INFO: renamed from: q0 */
                public Kind f52413q0 = Kind.PACKAGE;

                public QualifiedName buildPartial() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i10 = this.f52410Z;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    qualifiedName.f52405o0 = this.f52411o0;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    qualifiedName.f52406p0 = this.f52412p0;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    qualifiedName.f52407q0 = this.f52413q0;
                    qualifiedName.f52404Z = i11;
                    return qualifiedName;
                }

                public boolean hasShortName() {
                    return (this.f52410Z & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasShortName();
                }

                public Builder setKind(Kind kind) {
                    kind.getClass();
                    this.f52410Z |= 4;
                    this.f52413q0 = kind;
                    return this;
                }

                public Builder setParentQualifiedName(int i10) {
                    this.f52410Z |= 1;
                    this.f52411o0 = i10;
                    return this;
                }

                public Builder setShortName(int i10) {
                    this.f52410Z |= 2;
                    this.f52412p0 = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public QualifiedName build() {
                    QualifiedName qualifiedNameBuildPartial = buildPartial();
                    if (qualifiedNameBuildPartial.isInitialized()) {
                        return qualifiedNameBuildPartial;
                    }
                    throw new UninitializedMessageException(qualifiedNameBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo22588clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.f52403Y));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            QualifiedName partialFrom = QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            QualifiedName qualifiedName2 = (QualifiedName) e10.getUnfinishedMessage();
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    mergeFrom(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (qualifiedName != null) {
                            mergeFrom(qualifiedName);
                        }
                        throw th;
                    }
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);


                /* JADX INFO: renamed from: Y */
                public final int f52415Y;

                Kind(int i10) {
                    this.f52415Y = i10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f52415Y;
                }

                public static Kind valueOf(int i10) {
                    if (i10 == 0) {
                        return CLASS;
                    }
                    if (i10 == 1) {
                        return PACKAGE;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return LOCAL;
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName();
                f52402t0 = qualifiedName;
                qualifiedName.f52405o0 = -1;
                qualifiedName.f52406p0 = 0;
                qualifiedName.f52407q0 = Kind.PACKAGE;
            }

            public QualifiedName() {
                this.f52408r0 = (byte) -1;
                this.f52409s0 = -1;
                this.f52403Y = ByteString.EMPTY;
            }

            public static QualifiedName getDefaultInstance() {
                return f52402t0;
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            public Kind getKind() {
                return this.f52407q0;
            }

            public int getParentQualifiedName() {
                return this.f52405o0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.f52409s0;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeInt32Size = (this.f52404Z & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52405o0) : 0;
                if ((this.f52404Z & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52406p0);
                }
                if ((this.f52404Z & 4) == 4) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f52407q0.getNumber());
                }
                int size = this.f52403Y.size() + iComputeInt32Size;
                this.f52409s0 = size;
                return size;
            }

            public int getShortName() {
                return this.f52406p0;
            }

            public boolean hasKind() {
                return (this.f52404Z & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.f52404Z & 1) == 1;
            }

            public boolean hasShortName() {
                return (this.f52404Z & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f52408r0;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (hasShortName()) {
                    this.f52408r0 = (byte) 1;
                    return true;
                }
                this.f52408r0 = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f52404Z & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f52405o0);
                }
                if ((this.f52404Z & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.f52406p0);
                }
                if ((this.f52404Z & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.f52407q0.getNumber());
                }
                codedOutputStream.writeRawBytes(this.f52403Y);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedName getDefaultInstanceForType() {
                return f52402t0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public QualifiedName(CodedInputStream codedInputStream) {
                this.f52408r0 = (byte) -1;
                this.f52409s0 = -1;
                this.f52405o0 = -1;
                boolean z6 = false;
                this.f52406p0 = 0;
                this.f52407q0 = Kind.PACKAGE;
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f52404Z |= 1;
                                    this.f52405o0 = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.f52404Z |= 2;
                                    this.f52406p0 = codedInputStream.readInt32();
                                } else if (tag != 24) {
                                    if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    int i10 = codedInputStream.readEnum();
                                    Kind kindValueOf = Kind.valueOf(i10);
                                    if (kindValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i10);
                                    } else {
                                        this.f52404Z |= 4;
                                        this.f52407q0 = kindValueOf;
                                    }
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52403Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f52403Y = outputNewOutput.toByteString();
                }
            }

            public QualifiedName(Builder builder) {
                this.f52408r0 = (byte) -1;
                this.f52409s0 = -1;
                this.f52403Y = builder.getUnknownFields();
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable();
            f52395q0 = qualifiedNameTable;
            qualifiedNameTable.f52397Z = Collections.emptyList();
        }

        public QualifiedNameTable() {
            this.f52398o0 = (byte) -1;
            this.f52399p0 = -1;
            this.f52396Y = ByteString.EMPTY;
        }

        public static QualifiedNameTable getDefaultInstance() {
            return f52395q0;
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public QualifiedName getQualifiedName(int i10) {
            return (QualifiedName) this.f52397Z.get(i10);
        }

        public int getQualifiedNameCount() {
            return this.f52397Z.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52399p0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f52397Z.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f52397Z.get(i11));
            }
            int size = this.f52396Y.size() + iComputeMessageSize;
            this.f52399p0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52398o0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getQualifiedNameCount(); i10++) {
                if (!getQualifiedName(i10).isInitialized()) {
                    this.f52398o0 = (byte) 0;
                    return false;
                }
            }
            this.f52398o0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f52397Z.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f52397Z.get(i10));
            }
            codedOutputStream.writeRawBytes(this.f52396Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public QualifiedNameTable getDefaultInstanceForType() {
            return f52395q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52398o0 = (byte) -1;
            this.f52399p0 = -1;
            this.f52397Z = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            boolean z10 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                if (!z10) {
                                    this.f52397Z = new ArrayList();
                                    z10 = true;
                                }
                                this.f52397Z.add(codedInputStream.readMessage(QualifiedName.PARSER, extensionRegistryLite));
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        if (z10) {
                            this.f52397Z = DesugarCollections.unmodifiableList(this.f52397Z);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52396Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z10) {
                this.f52397Z = DesugarCollections.unmodifiableList(this.f52397Z);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52396Y = outputNewOutput.toByteString();
            }
        }

        public QualifiedNameTable(Builder builder) {
            this.f52398o0 = (byte) -1;
            this.f52399p0 = -1;
            this.f52396Y = builder.getUnknownFields();
        }
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new C16595p();

        /* JADX INFO: renamed from: q0 */
        public static final StringTable f52416q0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52417Y;

        /* JADX INFO: renamed from: Z */
        public LazyStringList f52418Z;

        /* JADX INFO: renamed from: o0 */
        public byte f52419o0;

        /* JADX INFO: renamed from: p0 */
        public int f52420p0;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52421Z;

            /* JADX INFO: renamed from: o0 */
            public LazyStringList f52422o0 = LazyStringArrayList.EMPTY;

            public StringTable buildPartial() {
                StringTable stringTable = new StringTable(this);
                if ((this.f52421Z & 1) == 1) {
                    this.f52422o0 = this.f52422o0.getUnmodifiableView();
                    this.f52421Z &= -2;
                }
                stringTable.f52418Z = this.f52422o0;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTable build() {
                StringTable stringTableBuildPartial = buildPartial();
                if (stringTableBuildPartial.isInitialized()) {
                    return stringTableBuildPartial;
                }
                throw new UninitializedMessageException(stringTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.f52418Z.isEmpty()) {
                    if (this.f52422o0.isEmpty()) {
                        this.f52422o0 = stringTable.f52418Z;
                        this.f52421Z &= -2;
                    } else {
                        if ((this.f52421Z & 1) != 1) {
                            this.f52422o0 = new LazyStringArrayList(this.f52422o0);
                            this.f52421Z |= 1;
                        }
                        this.f52422o0.addAll(stringTable.f52418Z);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.f52417Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        StringTable partialFrom = StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        StringTable stringTable2 = (StringTable) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                mergeFrom(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (stringTable != null) {
                        mergeFrom(stringTable);
                    }
                    throw th;
                }
            }
        }

        static {
            StringTable stringTable = new StringTable();
            f52416q0 = stringTable;
            stringTable.f52418Z = LazyStringArrayList.EMPTY;
        }

        public StringTable() {
            this.f52419o0 = (byte) -1;
            this.f52420p0 = -1;
            this.f52417Y = ByteString.EMPTY;
        }

        public static StringTable getDefaultInstance() {
            return f52416q0;
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52420p0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeBytesSizeNoTag = 0;
            for (int i11 = 0; i11 < this.f52418Z.size(); i11++) {
                iComputeBytesSizeNoTag += CodedOutputStream.computeBytesSizeNoTag(this.f52418Z.getByteString(i11));
            }
            int size = this.f52417Y.size() + getStringList().size() + iComputeBytesSizeNoTag;
            this.f52420p0 = size;
            return size;
        }

        public String getString(int i10) {
            return this.f52418Z.get(i10);
        }

        public ProtocolStringList getStringList() {
            return this.f52418Z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52419o0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f52419o0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f52418Z.size(); i10++) {
                codedOutputStream.writeBytes(1, this.f52418Z.getByteString(i10));
            }
            codedOutputStream.writeRawBytes(this.f52417Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTable getDefaultInstanceForType() {
            return f52416q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public StringTable(CodedInputStream codedInputStream) {
            this.f52419o0 = (byte) -1;
            this.f52420p0 = -1;
            this.f52418Z = LazyStringArrayList.EMPTY;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            boolean z10 = false;
            while (!z6) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag != 10) {
                                    if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    if (!z10) {
                                        this.f52418Z = new LazyStringArrayList();
                                        z10 = true;
                                    }
                                    this.f52418Z.add(bytes);
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
                    if (z10) {
                        this.f52418Z = this.f52418Z.getUnmodifiableView();
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52417Y = outputNewOutput.toByteString();
                    }
                    throw th2;
                }
            }
            if (z10) {
                this.f52418Z = this.f52418Z.getUnmodifiableView();
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52417Y = outputNewOutput.toByteString();
            }
        }

        public StringTable(Builder builder) {
            this.f52419o0 = (byte) -1;
            this.f52420p0 = -1;
            this.f52417Y = builder.getUnknownFields();
        }
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {

        /* JADX INFO: renamed from: F0 */
        public static final Type f52423F0;
        public static Parser<Type> PARSER = new C16596q();

        /* JADX INFO: renamed from: A0 */
        public Type f52424A0;

        /* JADX INFO: renamed from: B0 */
        public int f52425B0;

        /* JADX INFO: renamed from: C0 */
        public int f52426C0;

        /* JADX INFO: renamed from: D0 */
        public byte f52427D0;

        /* JADX INFO: renamed from: E0 */
        public int f52428E0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52429Z;

        /* JADX INFO: renamed from: o0 */
        public int f52430o0;

        /* JADX INFO: renamed from: p0 */
        public List f52431p0;

        /* JADX INFO: renamed from: q0 */
        public boolean f52432q0;

        /* JADX INFO: renamed from: r0 */
        public int f52433r0;

        /* JADX INFO: renamed from: s0 */
        public Type f52434s0;

        /* JADX INFO: renamed from: t0 */
        public int f52435t0;

        /* JADX INFO: renamed from: u0 */
        public int f52436u0;

        /* JADX INFO: renamed from: v0 */
        public int f52437v0;

        /* JADX INFO: renamed from: w0 */
        public int f52438w0;

        /* JADX INFO: renamed from: x0 */
        public int f52439x0;

        /* JADX INFO: renamed from: y0 */
        public Type f52440y0;

        /* JADX INFO: renamed from: z0 */
        public int f52441z0;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new C16597r();

            /* JADX INFO: renamed from: t0 */
            public static final Argument f52442t0;

            /* JADX INFO: renamed from: Y */
            public final ByteString f52443Y;

            /* JADX INFO: renamed from: Z */
            public int f52444Z;

            /* JADX INFO: renamed from: o0 */
            public Projection f52445o0;

            /* JADX INFO: renamed from: p0 */
            public Type f52446p0;

            /* JADX INFO: renamed from: q0 */
            public int f52447q0;

            /* JADX INFO: renamed from: r0 */
            public byte f52448r0;

            /* JADX INFO: renamed from: s0 */
            public int f52449s0;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: Z */
                public int f52450Z;

                /* JADX INFO: renamed from: o0 */
                public Projection f52451o0 = Projection.INV;

                /* JADX INFO: renamed from: p0 */
                public Type f52452p0 = Type.getDefaultInstance();

                /* JADX INFO: renamed from: q0 */
                public int f52453q0;

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i10 = this.f52450Z;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f52445o0 = this.f52451o0;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f52446p0 = this.f52452p0;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    argument.f52447q0 = this.f52453q0;
                    argument.f52444Z = i11;
                    return argument;
                }

                public Type getType() {
                    return this.f52452p0;
                }

                public boolean hasType() {
                    return (this.f52450Z & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasType() || getType().isInitialized();
                }

                public Builder mergeType(Type type) {
                    if ((this.f52450Z & 2) != 2 || this.f52452p0 == Type.getDefaultInstance()) {
                        this.f52452p0 = type;
                    } else {
                        this.f52452p0 = Type.newBuilder(this.f52452p0).mergeFrom(type).buildPartial();
                    }
                    this.f52450Z |= 2;
                    return this;
                }

                public Builder setProjection(Projection projection) {
                    projection.getClass();
                    this.f52450Z |= 1;
                    this.f52451o0 = projection;
                    return this;
                }

                public Builder setTypeId(int i10) {
                    this.f52450Z |= 4;
                    this.f52453q0 = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw new UninitializedMessageException(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo22588clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.f52443Y));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Argument argument2 = (Argument) e10.getUnfinishedMessage();
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);


                /* JADX INFO: renamed from: Y */
                public final int f52456Y;

                Projection(int i10) {
                    this.f52456Y = i10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.f52456Y;
                }

                public static Projection valueOf(int i10) {
                    if (i10 == 0) {
                        return IN;
                    }
                    if (i10 == 1) {
                        return OUT;
                    }
                    if (i10 == 2) {
                        return INV;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return STAR;
                }
            }

            static {
                Argument argument = new Argument();
                f52442t0 = argument;
                argument.f52445o0 = Projection.INV;
                argument.f52446p0 = Type.getDefaultInstance();
                argument.f52447q0 = 0;
            }

            public Argument() {
                this.f52448r0 = (byte) -1;
                this.f52449s0 = -1;
                this.f52443Y = ByteString.EMPTY;
            }

            public static Argument getDefaultInstance() {
                return f52442t0;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.f52445o0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.f52449s0;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeEnumSize = (this.f52444Z & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f52445o0.getNumber()) : 0;
                if ((this.f52444Z & 2) == 2) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.f52446p0);
                }
                if ((this.f52444Z & 4) == 4) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(3, this.f52447q0);
                }
                int size = this.f52443Y.size() + iComputeEnumSize;
                this.f52449s0 = size;
                return size;
            }

            public Type getType() {
                return this.f52446p0;
            }

            public int getTypeId() {
                return this.f52447q0;
            }

            public boolean hasProjection() {
                return (this.f52444Z & 1) == 1;
            }

            public boolean hasType() {
                return (this.f52444Z & 2) == 2;
            }

            public boolean hasTypeId() {
                return (this.f52444Z & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b = this.f52448r0;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.f52448r0 = (byte) 1;
                    return true;
                }
                this.f52448r0 = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                getSerializedSize();
                if ((this.f52444Z & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.f52445o0.getNumber());
                }
                if ((this.f52444Z & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.f52446p0);
                }
                if ((this.f52444Z & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.f52447q0);
                }
                codedOutputStream.writeRawBytes(this.f52443Y);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return f52442t0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                this.f52448r0 = (byte) -1;
                this.f52449s0 = -1;
                this.f52445o0 = Projection.INV;
                this.f52446p0 = Type.getDefaultInstance();
                boolean z6 = false;
                this.f52447q0 = 0;
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                while (!z6) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i10 = codedInputStream.readEnum();
                                    Projection projectionValueOf = Projection.valueOf(i10);
                                    if (projectionValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i10);
                                    } else {
                                        this.f52444Z |= 1;
                                        this.f52445o0 = projectionValueOf;
                                    }
                                } else if (tag == 18) {
                                    Builder builder = (this.f52444Z & 2) == 2 ? this.f52446p0.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f52446p0 = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.f52446p0 = builder.buildPartial();
                                    }
                                    this.f52444Z |= 2;
                                } else if (tag != 24) {
                                    if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                    }
                                } else {
                                    this.f52444Z |= 4;
                                    this.f52447q0 = codedInputStream.readInt32();
                                }
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52443Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f52443Y = outputNewOutput.toByteString();
                }
            }

            public Argument(Builder builder) {
                this.f52448r0 = (byte) -1;
                this.f52449s0 = -1;
                this.f52443Y = builder.getUnknownFields();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {

            /* JADX INFO: renamed from: A0 */
            public int f52457A0;

            /* JADX INFO: renamed from: C0 */
            public int f52459C0;

            /* JADX INFO: renamed from: D0 */
            public int f52460D0;

            /* JADX INFO: renamed from: p0 */
            public int f52461p0;

            /* JADX INFO: renamed from: r0 */
            public boolean f52463r0;

            /* JADX INFO: renamed from: s0 */
            public int f52464s0;

            /* JADX INFO: renamed from: u0 */
            public int f52466u0;

            /* JADX INFO: renamed from: v0 */
            public int f52467v0;

            /* JADX INFO: renamed from: w0 */
            public int f52468w0;

            /* JADX INFO: renamed from: x0 */
            public int f52469x0;

            /* JADX INFO: renamed from: y0 */
            public int f52470y0;

            /* JADX INFO: renamed from: q0 */
            public List f52462q0 = Collections.emptyList();

            /* JADX INFO: renamed from: t0 */
            public Type f52465t0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: z0 */
            public Type f52471z0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: B0 */
            public Type f52458B0 = Type.getDefaultInstance();

            public Type buildPartial() {
                Type type = new Type(this);
                int i10 = this.f52461p0;
                if ((i10 & 1) == 1) {
                    this.f52462q0 = DesugarCollections.unmodifiableList(this.f52462q0);
                    this.f52461p0 &= -2;
                }
                type.f52431p0 = this.f52462q0;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                type.f52432q0 = this.f52463r0;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                type.f52433r0 = this.f52464s0;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                type.f52434s0 = this.f52465t0;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                type.f52435t0 = this.f52466u0;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                type.f52436u0 = this.f52467v0;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                type.f52437v0 = this.f52468w0;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                type.f52438w0 = this.f52469x0;
                if ((i10 & 256) == 256) {
                    i11 |= 128;
                }
                type.f52439x0 = this.f52470y0;
                if ((i10 & 512) == 512) {
                    i11 |= 256;
                }
                type.f52440y0 = this.f52471z0;
                if ((i10 & 1024) == 1024) {
                    i11 |= 512;
                }
                type.f52441z0 = this.f52457A0;
                if ((i10 & 2048) == 2048) {
                    i11 |= 1024;
                }
                type.f52424A0 = this.f52458B0;
                if ((i10 & 4096) == 4096) {
                    i11 |= 2048;
                }
                type.f52425B0 = this.f52459C0;
                if ((i10 & 8192) == 8192) {
                    i11 |= 4096;
                }
                type.f52426C0 = this.f52460D0;
                type.f52430o0 = i11;
                return type;
            }

            public Type getAbbreviatedType() {
                return this.f52458B0;
            }

            public Argument getArgument(int i10) {
                return (Argument) this.f52462q0.get(i10);
            }

            public int getArgumentCount() {
                return this.f52462q0.size();
            }

            public Type getFlexibleUpperBound() {
                return this.f52465t0;
            }

            public Type getOuterType() {
                return this.f52471z0;
            }

            public boolean hasAbbreviatedType() {
                return (this.f52461p0 & 2048) == 2048;
            }

            public boolean hasFlexibleUpperBound() {
                return (this.f52461p0 & 8) == 8;
            }

            public boolean hasOuterType() {
                return (this.f52461p0 & 512) == 512;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getArgumentCount(); i10++) {
                    if (!getArgument(i10).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (!hasOuterType() || getOuterType().isInitialized()) {
                    return (!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && this.f52733Z.m18301f();
                }
                return false;
            }

            public Builder mergeAbbreviatedType(Type type) {
                if ((this.f52461p0 & 2048) != 2048 || this.f52458B0 == Type.getDefaultInstance()) {
                    this.f52458B0 = type;
                } else {
                    this.f52458B0 = Type.newBuilder(this.f52458B0).mergeFrom(type).buildPartial();
                }
                this.f52461p0 |= 2048;
                return this;
            }

            public Builder mergeFlexibleUpperBound(Type type) {
                if ((this.f52461p0 & 8) != 8 || this.f52465t0 == Type.getDefaultInstance()) {
                    this.f52465t0 = type;
                } else {
                    this.f52465t0 = Type.newBuilder(this.f52465t0).mergeFrom(type).buildPartial();
                }
                this.f52461p0 |= 8;
                return this;
            }

            public Builder mergeOuterType(Type type) {
                if ((this.f52461p0 & 512) != 512 || this.f52471z0 == Type.getDefaultInstance()) {
                    this.f52471z0 = type;
                } else {
                    this.f52471z0 = Type.newBuilder(this.f52471z0).mergeFrom(type).buildPartial();
                }
                this.f52461p0 |= 512;
                return this;
            }

            public Builder setAbbreviatedTypeId(int i10) {
                this.f52461p0 |= 4096;
                this.f52459C0 = i10;
                return this;
            }

            public Builder setClassName(int i10) {
                this.f52461p0 |= 32;
                this.f52467v0 = i10;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f52461p0 |= 8192;
                this.f52460D0 = i10;
                return this;
            }

            public Builder setFlexibleTypeCapabilitiesId(int i10) {
                this.f52461p0 |= 4;
                this.f52464s0 = i10;
                return this;
            }

            public Builder setFlexibleUpperBoundId(int i10) {
                this.f52461p0 |= 16;
                this.f52466u0 = i10;
                return this;
            }

            public Builder setNullable(boolean z6) {
                this.f52461p0 |= 2;
                this.f52463r0 = z6;
                return this;
            }

            public Builder setOuterTypeId(int i10) {
                this.f52461p0 |= 1024;
                this.f52457A0 = i10;
                return this;
            }

            public Builder setTypeAliasName(int i10) {
                this.f52461p0 |= 256;
                this.f52470y0 = i10;
                return this;
            }

            public Builder setTypeParameter(int i10) {
                this.f52461p0 |= 64;
                this.f52468w0 = i10;
                return this;
            }

            public Builder setTypeParameterName(int i10) {
                this.f52461p0 |= 128;
                this.f52469x0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Type build() {
                Type typeBuildPartial = buildPartial();
                if (typeBuildPartial.isInitialized()) {
                    return typeBuildPartial;
                }
                throw new UninitializedMessageException(typeBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.f52431p0.isEmpty()) {
                    if (this.f52462q0.isEmpty()) {
                        this.f52462q0 = type.f52431p0;
                        this.f52461p0 &= -2;
                    } else {
                        if ((this.f52461p0 & 1) != 1) {
                            this.f52462q0 = new ArrayList(this.f52462q0);
                            this.f52461p0 |= 1;
                        }
                        this.f52462q0.addAll(type.f52431p0);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                m18283a(type);
                setUnknownFields(getUnknownFields().concat(type.f52429Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Type type = null;
                try {
                    try {
                        Type partialFrom = Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Type type2 = (Type) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            type = type2;
                            if (type != null) {
                                mergeFrom(type);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (type != null) {
                        mergeFrom(type);
                    }
                    throw th;
                }
            }
        }

        static {
            Type type = new Type();
            f52423F0 = type;
            type.m18254e();
        }

        public Type(Builder builder) {
            super(builder);
            this.f52427D0 = (byte) -1;
            this.f52428E0 = -1;
            this.f52429Z = builder.getUnknownFields();
        }

        public static Type getDefaultInstance() {
            return f52423F0;
        }

        public static Builder newBuilder(Type type) {
            return newBuilder().mergeFrom(type);
        }

        /* JADX INFO: renamed from: e */
        public final void m18254e() {
            this.f52431p0 = Collections.emptyList();
            this.f52432q0 = false;
            this.f52433r0 = 0;
            this.f52434s0 = getDefaultInstance();
            this.f52435t0 = 0;
            this.f52436u0 = 0;
            this.f52437v0 = 0;
            this.f52438w0 = 0;
            this.f52439x0 = 0;
            this.f52440y0 = getDefaultInstance();
            this.f52441z0 = 0;
            this.f52424A0 = getDefaultInstance();
            this.f52425B0 = 0;
            this.f52426C0 = 0;
        }

        public Type getAbbreviatedType() {
            return this.f52424A0;
        }

        public int getAbbreviatedTypeId() {
            return this.f52425B0;
        }

        public Argument getArgument(int i10) {
            return (Argument) this.f52431p0.get(i10);
        }

        public int getArgumentCount() {
            return this.f52431p0.size();
        }

        public List<Argument> getArgumentList() {
            return this.f52431p0;
        }

        public int getClassName() {
            return this.f52436u0;
        }

        public int getFlags() {
            return this.f52426C0;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.f52433r0;
        }

        public Type getFlexibleUpperBound() {
            return this.f52434s0;
        }

        public int getFlexibleUpperBoundId() {
            return this.f52435t0;
        }

        public boolean getNullable() {
            return this.f52432q0;
        }

        public Type getOuterType() {
            return this.f52440y0;
        }

        public int getOuterTypeId() {
            return this.f52441z0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52428E0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52430o0 & 4096) == 4096 ? CodedOutputStream.computeInt32Size(1, this.f52426C0) : 0;
            for (int i11 = 0; i11 < this.f52431p0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f52431p0.get(i11));
            }
            if ((this.f52430o0 & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.f52432q0);
            }
            if ((this.f52430o0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f52433r0);
            }
            if ((this.f52430o0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f52434s0);
            }
            if ((this.f52430o0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.f52436u0);
            }
            if ((this.f52430o0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f52437v0);
            }
            if ((this.f52430o0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.f52435t0);
            }
            if ((this.f52430o0 & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.f52438w0);
            }
            if ((this.f52430o0 & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, this.f52440y0);
            }
            if ((this.f52430o0 & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.f52441z0);
            }
            if ((this.f52430o0 & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(12, this.f52439x0);
            }
            if ((this.f52430o0 & 1024) == 1024) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, this.f52424A0);
            }
            if ((this.f52430o0 & 2048) == 2048) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(14, this.f52425B0);
            }
            int size = this.f52429Z.size() + m18284a() + iComputeInt32Size;
            this.f52428E0 = size;
            return size;
        }

        public int getTypeAliasName() {
            return this.f52439x0;
        }

        public int getTypeParameter() {
            return this.f52437v0;
        }

        public int getTypeParameterName() {
            return this.f52438w0;
        }

        public boolean hasAbbreviatedType() {
            return (this.f52430o0 & 1024) == 1024;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.f52430o0 & 2048) == 2048;
        }

        public boolean hasClassName() {
            return (this.f52430o0 & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.f52430o0 & 4096) == 4096;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.f52430o0 & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.f52430o0 & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.f52430o0 & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.f52430o0 & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.f52430o0 & 256) == 256;
        }

        public boolean hasOuterTypeId() {
            return (this.f52430o0 & 512) == 512;
        }

        public boolean hasTypeAliasName() {
            return (this.f52430o0 & 128) == 128;
        }

        public boolean hasTypeParameter() {
            return (this.f52430o0 & 32) == 32;
        }

        public boolean hasTypeParameterName() {
            return (this.f52430o0 & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52427D0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getArgumentCount(); i10++) {
                if (!getArgument(i10).isInitialized()) {
                    this.f52427D0 = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.f52427D0 = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.f52427D0 = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.f52427D0 = (byte) 0;
                return false;
            }
            if (this.f52735Y.m18301f()) {
                this.f52427D0 = (byte) 1;
                return true;
            }
            this.f52427D0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52430o0 & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.f52426C0);
            }
            for (int i10 = 0; i10 < this.f52431p0.size(); i10++) {
                codedOutputStream.writeMessage(2, (MessageLite) this.f52431p0.get(i10));
            }
            if ((this.f52430o0 & 1) == 1) {
                codedOutputStream.writeBool(3, this.f52432q0);
            }
            if ((this.f52430o0 & 2) == 2) {
                codedOutputStream.writeInt32(4, this.f52433r0);
            }
            if ((this.f52430o0 & 4) == 4) {
                codedOutputStream.writeMessage(5, this.f52434s0);
            }
            if ((this.f52430o0 & 16) == 16) {
                codedOutputStream.writeInt32(6, this.f52436u0);
            }
            if ((this.f52430o0 & 32) == 32) {
                codedOutputStream.writeInt32(7, this.f52437v0);
            }
            if ((this.f52430o0 & 8) == 8) {
                codedOutputStream.writeInt32(8, this.f52435t0);
            }
            if ((this.f52430o0 & 64) == 64) {
                codedOutputStream.writeInt32(9, this.f52438w0);
            }
            if ((this.f52430o0 & 256) == 256) {
                codedOutputStream.writeMessage(10, this.f52440y0);
            }
            if ((this.f52430o0 & 512) == 512) {
                codedOutputStream.writeInt32(11, this.f52441z0);
            }
            if ((this.f52430o0 & 128) == 128) {
                codedOutputStream.writeInt32(12, this.f52439x0);
            }
            if ((this.f52430o0 & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.f52424A0);
            }
            if ((this.f52430o0 & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.f52425B0);
            }
            extensionWriter.writeUntil(RCHTTPStatusCodes.SUCCESS, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52429Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Type getDefaultInstanceForType() {
            return f52423F0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Type() {
            this.f52427D0 = (byte) -1;
            this.f52428E0 = -1;
            this.f52429Z = ByteString.EMPTY;
        }

        public Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Builder builder;
            this.f52427D0 = (byte) -1;
            this.f52428E0 = -1;
            m18254e();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            boolean z10 = false;
            while (!z6) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.f52430o0 |= 4096;
                                    this.f52426C0 = codedInputStream.readInt32();
                                    continue;
                                case 18:
                                    if (!z10) {
                                        this.f52431p0 = new ArrayList();
                                        z10 = true;
                                    }
                                    this.f52431p0.add(codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                                    continue;
                                case 24:
                                    this.f52430o0 |= 1;
                                    this.f52432q0 = codedInputStream.readBool();
                                    continue;
                                case 32:
                                    this.f52430o0 |= 2;
                                    this.f52433r0 = codedInputStream.readInt32();
                                    continue;
                                case 42:
                                    builder = (this.f52430o0 & 4) == 4 ? this.f52434s0.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.f52434s0 = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.f52434s0 = builder.buildPartial();
                                    }
                                    this.f52430o0 |= 4;
                                    continue;
                                case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                                    this.f52430o0 |= 16;
                                    this.f52436u0 = codedInputStream.readInt32();
                                    continue;
                                case 56:
                                    this.f52430o0 |= 32;
                                    this.f52437v0 = codedInputStream.readInt32();
                                    continue;
                                case 64:
                                    this.f52430o0 |= 8;
                                    this.f52435t0 = codedInputStream.readInt32();
                                    continue;
                                case 72:
                                    this.f52430o0 |= 64;
                                    this.f52438w0 = codedInputStream.readInt32();
                                    continue;
                                case 82:
                                    builder = (this.f52430o0 & 256) == 256 ? this.f52440y0.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.f52440y0 = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.f52440y0 = builder.buildPartial();
                                    }
                                    this.f52430o0 |= 256;
                                    continue;
                                case 88:
                                    this.f52430o0 |= 512;
                                    this.f52441z0 = codedInputStream.readInt32();
                                    continue;
                                case 96:
                                    this.f52430o0 |= 128;
                                    this.f52439x0 = codedInputStream.readInt32();
                                    continue;
                                case 106:
                                    builder = (this.f52430o0 & 1024) == 1024 ? this.f52424A0.toBuilder() : null;
                                    Type type3 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.f52424A0 = type3;
                                    if (builder != null) {
                                        builder.mergeFrom(type3);
                                        this.f52424A0 = builder.buildPartial();
                                    }
                                    this.f52430o0 |= 1024;
                                    continue;
                                case 112:
                                    this.f52430o0 |= 2048;
                                    this.f52425B0 = codedInputStream.readInt32();
                                    continue;
                                default:
                                    if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z6 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z10) {
                        this.f52431p0 = DesugarCollections.unmodifiableList(this.f52431p0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52429Z = outputNewOutput.toByteString();
                    }
                    m18285b();
                    throw th2;
                }
            }
            if (z10) {
                this.f52431p0 = DesugarCollections.unmodifiableList(this.f52431p0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52429Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {

        /* JADX INFO: renamed from: A0 */
        public static final TypeAlias f52472A0;
        public static Parser<TypeAlias> PARSER = new C16598s();

        /* JADX INFO: renamed from: Z */
        public final ByteString f52473Z;

        /* JADX INFO: renamed from: o0 */
        public int f52474o0;

        /* JADX INFO: renamed from: p0 */
        public int f52475p0;

        /* JADX INFO: renamed from: q0 */
        public int f52476q0;

        /* JADX INFO: renamed from: r0 */
        public List f52477r0;

        /* JADX INFO: renamed from: s0 */
        public Type f52478s0;

        /* JADX INFO: renamed from: t0 */
        public int f52479t0;

        /* JADX INFO: renamed from: u0 */
        public Type f52480u0;

        /* JADX INFO: renamed from: v0 */
        public int f52481v0;

        /* JADX INFO: renamed from: w0 */
        public List f52482w0;

        /* JADX INFO: renamed from: x0 */
        public List f52483x0;

        /* JADX INFO: renamed from: y0 */
        public byte f52484y0;

        /* JADX INFO: renamed from: z0 */
        public int f52485z0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {

            /* JADX INFO: renamed from: p0 */
            public int f52486p0;

            /* JADX INFO: renamed from: r0 */
            public int f52488r0;

            /* JADX INFO: renamed from: u0 */
            public int f52491u0;

            /* JADX INFO: renamed from: w0 */
            public int f52493w0;

            /* JADX INFO: renamed from: q0 */
            public int f52487q0 = 6;

            /* JADX INFO: renamed from: s0 */
            public List f52489s0 = Collections.emptyList();

            /* JADX INFO: renamed from: t0 */
            public Type f52490t0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: v0 */
            public Type f52492v0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: x0 */
            public List f52494x0 = Collections.emptyList();

            /* JADX INFO: renamed from: y0 */
            public List f52495y0 = Collections.emptyList();

            public TypeAlias buildPartial() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i10 = this.f52486p0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeAlias.f52475p0 = this.f52487q0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeAlias.f52476q0 = this.f52488r0;
                if ((i10 & 4) == 4) {
                    this.f52489s0 = DesugarCollections.unmodifiableList(this.f52489s0);
                    this.f52486p0 &= -5;
                }
                typeAlias.f52477r0 = this.f52489s0;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                typeAlias.f52478s0 = this.f52490t0;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                typeAlias.f52479t0 = this.f52491u0;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                typeAlias.f52480u0 = this.f52492v0;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                typeAlias.f52481v0 = this.f52493w0;
                if ((this.f52486p0 & 128) == 128) {
                    this.f52494x0 = DesugarCollections.unmodifiableList(this.f52494x0);
                    this.f52486p0 &= -129;
                }
                typeAlias.f52482w0 = this.f52494x0;
                if ((this.f52486p0 & 256) == 256) {
                    this.f52495y0 = DesugarCollections.unmodifiableList(this.f52495y0);
                    this.f52486p0 &= -257;
                }
                typeAlias.f52483x0 = this.f52495y0;
                typeAlias.f52474o0 = i11;
                return typeAlias;
            }

            public Annotation getAnnotation(int i10) {
                return (Annotation) this.f52494x0.get(i10);
            }

            public int getAnnotationCount() {
                return this.f52494x0.size();
            }

            public Type getExpandedType() {
                return this.f52492v0;
            }

            public TypeParameter getTypeParameter(int i10) {
                return (TypeParameter) this.f52489s0.get(i10);
            }

            public int getTypeParameterCount() {
                return this.f52489s0.size();
            }

            public Type getUnderlyingType() {
                return this.f52490t0;
            }

            public boolean hasExpandedType() {
                return (this.f52486p0 & 32) == 32;
            }

            public boolean hasName() {
                return (this.f52486p0 & 2) == 2;
            }

            public boolean hasUnderlyingType() {
                return (this.f52486p0 & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                    if (!getTypeParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getAnnotationCount(); i11++) {
                    if (!getAnnotation(i11).isInitialized()) {
                        return false;
                    }
                }
                return this.f52733Z.m18301f();
            }

            public Builder mergeExpandedType(Type type) {
                if ((this.f52486p0 & 32) != 32 || this.f52492v0 == Type.getDefaultInstance()) {
                    this.f52492v0 = type;
                } else {
                    this.f52492v0 = Type.newBuilder(this.f52492v0).mergeFrom(type).buildPartial();
                }
                this.f52486p0 |= 32;
                return this;
            }

            public Builder mergeUnderlyingType(Type type) {
                if ((this.f52486p0 & 8) != 8 || this.f52490t0 == Type.getDefaultInstance()) {
                    this.f52490t0 = type;
                } else {
                    this.f52490t0 = Type.newBuilder(this.f52490t0).mergeFrom(type).buildPartial();
                }
                this.f52486p0 |= 8;
                return this;
            }

            public Builder setExpandedTypeId(int i10) {
                this.f52486p0 |= 64;
                this.f52493w0 = i10;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f52486p0 |= 1;
                this.f52487q0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f52486p0 |= 2;
                this.f52488r0 = i10;
                return this;
            }

            public Builder setUnderlyingTypeId(int i10) {
                this.f52486p0 |= 16;
                this.f52491u0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeAlias build() {
                TypeAlias typeAliasBuildPartial = buildPartial();
                if (typeAliasBuildPartial.isInitialized()) {
                    return typeAliasBuildPartial;
                }
                throw new UninitializedMessageException(typeAliasBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.f52477r0.isEmpty()) {
                    if (this.f52489s0.isEmpty()) {
                        this.f52489s0 = typeAlias.f52477r0;
                        this.f52486p0 &= -5;
                    } else {
                        if ((this.f52486p0 & 4) != 4) {
                            this.f52489s0 = new ArrayList(this.f52489s0);
                            this.f52486p0 |= 4;
                        }
                        this.f52489s0.addAll(typeAlias.f52477r0);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.f52482w0.isEmpty()) {
                    if (this.f52494x0.isEmpty()) {
                        this.f52494x0 = typeAlias.f52482w0;
                        this.f52486p0 &= -129;
                    } else {
                        if ((this.f52486p0 & 128) != 128) {
                            this.f52494x0 = new ArrayList(this.f52494x0);
                            this.f52486p0 |= 128;
                        }
                        this.f52494x0.addAll(typeAlias.f52482w0);
                    }
                }
                if (!typeAlias.f52483x0.isEmpty()) {
                    if (this.f52495y0.isEmpty()) {
                        this.f52495y0 = typeAlias.f52483x0;
                        this.f52486p0 &= -257;
                    } else {
                        if ((this.f52486p0 & 256) != 256) {
                            this.f52495y0 = new ArrayList(this.f52495y0);
                            this.f52486p0 |= 256;
                        }
                        this.f52495y0.addAll(typeAlias.f52483x0);
                    }
                }
                m18283a(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.f52473Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        TypeAlias partialFrom = TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        TypeAlias typeAlias2 = (TypeAlias) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                mergeFrom(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeAlias != null) {
                        mergeFrom(typeAlias);
                    }
                    throw th;
                }
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias();
            f52472A0 = typeAlias;
            typeAlias.m18255e();
        }

        public TypeAlias(Builder builder) {
            super(builder);
            this.f52484y0 = (byte) -1;
            this.f52485z0 = -1;
            this.f52473Z = builder.getUnknownFields();
        }

        public static TypeAlias getDefaultInstance() {
            return f52472A0;
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        /* JADX INFO: renamed from: e */
        public final void m18255e() {
            this.f52475p0 = 6;
            this.f52476q0 = 0;
            this.f52477r0 = Collections.emptyList();
            this.f52478s0 = Type.getDefaultInstance();
            this.f52479t0 = 0;
            this.f52480u0 = Type.getDefaultInstance();
            this.f52481v0 = 0;
            this.f52482w0 = Collections.emptyList();
            this.f52483x0 = Collections.emptyList();
        }

        public Annotation getAnnotation(int i10) {
            return (Annotation) this.f52482w0.get(i10);
        }

        public int getAnnotationCount() {
            return this.f52482w0.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.f52482w0;
        }

        public Type getExpandedType() {
            return this.f52480u0;
        }

        public int getExpandedTypeId() {
            return this.f52481v0;
        }

        public int getFlags() {
            return this.f52475p0;
        }

        public int getName() {
            return this.f52476q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52485z0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52474o0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52475p0) : 0;
            if ((this.f52474o0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52476q0);
            }
            for (int i11 = 0; i11 < this.f52477r0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f52477r0.get(i11));
            }
            if ((this.f52474o0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f52478s0);
            }
            if ((this.f52474o0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f52479t0);
            }
            if ((this.f52474o0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.f52480u0);
            }
            if ((this.f52474o0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f52481v0);
            }
            for (int i12 = 0; i12 < this.f52482w0.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(8, (MessageLite) this.f52482w0.get(i12));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i13 = 0; i13 < this.f52483x0.size(); i13++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52483x0.get(i13)).intValue());
            }
            int size = this.f52473Z.size() + m18284a() + (getVersionRequirementList().size() * 2) + iComputeInt32Size + iComputeInt32SizeNoTag;
            this.f52485z0 = size;
            return size;
        }

        public TypeParameter getTypeParameter(int i10) {
            return (TypeParameter) this.f52477r0.get(i10);
        }

        public int getTypeParameterCount() {
            return this.f52477r0.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f52477r0;
        }

        public Type getUnderlyingType() {
            return this.f52478s0;
        }

        public int getUnderlyingTypeId() {
            return this.f52479t0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f52483x0;
        }

        public boolean hasExpandedType() {
            return (this.f52474o0 & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.f52474o0 & 32) == 32;
        }

        public boolean hasFlags() {
            return (this.f52474o0 & 1) == 1;
        }

        public boolean hasName() {
            return (this.f52474o0 & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.f52474o0 & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.f52474o0 & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52484y0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.f52484y0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                if (!getTypeParameter(i10).isInitialized()) {
                    this.f52484y0 = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.f52484y0 = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.f52484y0 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getAnnotationCount(); i11++) {
                if (!getAnnotation(i11).isInitialized()) {
                    this.f52484y0 = (byte) 0;
                    return false;
                }
            }
            if (this.f52735Y.m18301f()) {
                this.f52484y0 = (byte) 1;
                return true;
            }
            this.f52484y0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52474o0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52475p0);
            }
            if ((this.f52474o0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f52476q0);
            }
            for (int i10 = 0; i10 < this.f52477r0.size(); i10++) {
                codedOutputStream.writeMessage(3, (MessageLite) this.f52477r0.get(i10));
            }
            if ((this.f52474o0 & 4) == 4) {
                codedOutputStream.writeMessage(4, this.f52478s0);
            }
            if ((this.f52474o0 & 8) == 8) {
                codedOutputStream.writeInt32(5, this.f52479t0);
            }
            if ((this.f52474o0 & 16) == 16) {
                codedOutputStream.writeMessage(6, this.f52480u0);
            }
            if ((this.f52474o0 & 32) == 32) {
                codedOutputStream.writeInt32(7, this.f52481v0);
            }
            for (int i11 = 0; i11 < this.f52482w0.size(); i11++) {
                codedOutputStream.writeMessage(8, (MessageLite) this.f52482w0.get(i11));
            }
            for (int i12 = 0; i12 < this.f52483x0.size(); i12++) {
                codedOutputStream.writeInt32(31, ((Integer) this.f52483x0.get(i12)).intValue());
            }
            extensionWriter.writeUntil(RCHTTPStatusCodes.SUCCESS, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52473Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeAlias getDefaultInstanceForType() {
            return f52472A0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public TypeAlias() {
            this.f52484y0 = (byte) -1;
            this.f52485z0 = -1;
            this.f52473Z = ByteString.EMPTY;
        }

        public TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Type.Builder builder;
            this.f52484y0 = (byte) -1;
            this.f52485z0 = -1;
            m18255e();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            int i10 = 0;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f52474o0 |= 1;
                                this.f52475p0 = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.f52474o0 |= 2;
                                this.f52476q0 = codedInputStream.readInt32();
                                continue;
                            case 26:
                                if ((i10 & 4) != 4) {
                                    this.f52477r0 = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f52477r0.add(codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 34:
                                builder = (this.f52474o0 & 4) == 4 ? this.f52478s0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f52478s0 = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f52478s0 = builder.buildPartial();
                                }
                                this.f52474o0 |= 4;
                                continue;
                            case 40:
                                this.f52474o0 |= 8;
                                this.f52479t0 = codedInputStream.readInt32();
                                continue;
                            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                                builder = (this.f52474o0 & 16) == 16 ? this.f52480u0.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f52480u0 = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.f52480u0 = builder.buildPartial();
                                }
                                this.f52474o0 |= 16;
                                continue;
                            case 56:
                                this.f52474o0 |= 32;
                                this.f52481v0 = codedInputStream.readInt32();
                                continue;
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.f52482w0 = new ArrayList();
                                    i10 |= 128;
                                }
                                this.f52482w0.add(codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                continue;
                            case 248:
                                if ((i10 & 256) != 256) {
                                    this.f52483x0 = new ArrayList();
                                    i10 |= 256;
                                }
                                this.f52483x0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 250:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52483x0 = new ArrayList();
                                    i10 |= 256;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52483x0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            default:
                                if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 4) == 4) {
                            this.f52477r0 = DesugarCollections.unmodifiableList(this.f52477r0);
                        }
                        if ((i10 & 128) == 128) {
                            this.f52482w0 = DesugarCollections.unmodifiableList(this.f52482w0);
                        }
                        if ((i10 & 256) == 256) {
                            this.f52483x0 = DesugarCollections.unmodifiableList(this.f52483x0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52473Z = outputNewOutput.toByteString();
                        }
                        m18285b();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i10 & 4) == 4) {
                this.f52477r0 = DesugarCollections.unmodifiableList(this.f52477r0);
            }
            if ((i10 & 128) == 128) {
                this.f52482w0 = DesugarCollections.unmodifiableList(this.f52482w0);
            }
            if ((i10 & 256) == 256) {
                this.f52483x0 = DesugarCollections.unmodifiableList(this.f52483x0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52473Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static Parser<TypeParameter> PARSER = new C16599t();

        /* JADX INFO: renamed from: y0 */
        public static final TypeParameter f52496y0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52497Z;

        /* JADX INFO: renamed from: o0 */
        public int f52498o0;

        /* JADX INFO: renamed from: p0 */
        public int f52499p0;

        /* JADX INFO: renamed from: q0 */
        public int f52500q0;

        /* JADX INFO: renamed from: r0 */
        public boolean f52501r0;

        /* JADX INFO: renamed from: s0 */
        public Variance f52502s0;

        /* JADX INFO: renamed from: t0 */
        public List f52503t0;

        /* JADX INFO: renamed from: u0 */
        public List f52504u0;

        /* JADX INFO: renamed from: v0 */
        public int f52505v0;

        /* JADX INFO: renamed from: w0 */
        public byte f52506w0;

        /* JADX INFO: renamed from: x0 */
        public int f52507x0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {

            /* JADX INFO: renamed from: p0 */
            public int f52508p0;

            /* JADX INFO: renamed from: q0 */
            public int f52509q0;

            /* JADX INFO: renamed from: r0 */
            public int f52510r0;

            /* JADX INFO: renamed from: s0 */
            public boolean f52511s0;

            /* JADX INFO: renamed from: t0 */
            public Variance f52512t0 = Variance.INV;

            /* JADX INFO: renamed from: u0 */
            public List f52513u0 = Collections.emptyList();

            /* JADX INFO: renamed from: v0 */
            public List f52514v0 = Collections.emptyList();

            public TypeParameter buildPartial() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i10 = this.f52508p0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeParameter.f52499p0 = this.f52509q0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeParameter.f52500q0 = this.f52510r0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                typeParameter.f52501r0 = this.f52511s0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                typeParameter.f52502s0 = this.f52512t0;
                if ((i10 & 16) == 16) {
                    this.f52513u0 = DesugarCollections.unmodifiableList(this.f52513u0);
                    this.f52508p0 &= -17;
                }
                typeParameter.f52503t0 = this.f52513u0;
                if ((this.f52508p0 & 32) == 32) {
                    this.f52514v0 = DesugarCollections.unmodifiableList(this.f52514v0);
                    this.f52508p0 &= -33;
                }
                typeParameter.f52504u0 = this.f52514v0;
                typeParameter.f52498o0 = i11;
                return typeParameter;
            }

            public Type getUpperBound(int i10) {
                return (Type) this.f52513u0.get(i10);
            }

            public int getUpperBoundCount() {
                return this.f52513u0.size();
            }

            public boolean hasId() {
                return (this.f52508p0 & 1) == 1;
            }

            public boolean hasName() {
                return (this.f52508p0 & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i10 = 0; i10 < getUpperBoundCount(); i10++) {
                    if (!getUpperBound(i10).isInitialized()) {
                        return false;
                    }
                }
                return this.f52733Z.m18301f();
            }

            public Builder setId(int i10) {
                this.f52508p0 |= 1;
                this.f52509q0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f52508p0 |= 2;
                this.f52510r0 = i10;
                return this;
            }

            public Builder setReified(boolean z6) {
                this.f52508p0 |= 4;
                this.f52511s0 = z6;
                return this;
            }

            public Builder setVariance(Variance variance) {
                variance.getClass();
                this.f52508p0 |= 8;
                this.f52512t0 = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeParameter build() {
                TypeParameter typeParameterBuildPartial = buildPartial();
                if (typeParameterBuildPartial.isInitialized()) {
                    return typeParameterBuildPartial;
                }
                throw new UninitializedMessageException(typeParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.f52503t0.isEmpty()) {
                    if (this.f52513u0.isEmpty()) {
                        this.f52513u0 = typeParameter.f52503t0;
                        this.f52508p0 &= -17;
                    } else {
                        if ((this.f52508p0 & 16) != 16) {
                            this.f52513u0 = new ArrayList(this.f52513u0);
                            this.f52508p0 |= 16;
                        }
                        this.f52513u0.addAll(typeParameter.f52503t0);
                    }
                }
                if (!typeParameter.f52504u0.isEmpty()) {
                    if (this.f52514v0.isEmpty()) {
                        this.f52514v0 = typeParameter.f52504u0;
                        this.f52508p0 &= -33;
                    } else {
                        if ((this.f52508p0 & 32) != 32) {
                            this.f52514v0 = new ArrayList(this.f52514v0);
                            this.f52508p0 |= 32;
                        }
                        this.f52514v0.addAll(typeParameter.f52504u0);
                    }
                }
                m18283a(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.f52497Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        TypeParameter partialFrom = TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        TypeParameter typeParameter2 = (TypeParameter) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                mergeFrom(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeParameter != null) {
                        mergeFrom(typeParameter);
                    }
                    throw th;
                }
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0),
            OUT(1),
            INV(2);


            /* JADX INFO: renamed from: Y */
            public final int f52517Y;

            Variance(int i10) {
                this.f52517Y = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f52517Y;
            }

            public static Variance valueOf(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 != 2) {
                    return null;
                }
                return INV;
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter();
            f52496y0 = typeParameter;
            typeParameter.f52499p0 = 0;
            typeParameter.f52500q0 = 0;
            typeParameter.f52501r0 = false;
            typeParameter.f52502s0 = Variance.INV;
            typeParameter.f52503t0 = Collections.emptyList();
            typeParameter.f52504u0 = Collections.emptyList();
        }

        public TypeParameter(Builder builder) {
            super(builder);
            this.f52505v0 = -1;
            this.f52506w0 = (byte) -1;
            this.f52507x0 = -1;
            this.f52497Z = builder.getUnknownFields();
        }

        public static TypeParameter getDefaultInstance() {
            return f52496y0;
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        public int getId() {
            return this.f52499p0;
        }

        public int getName() {
            return this.f52500q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.f52501r0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52507x0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52498o0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52499p0) : 0;
            if ((this.f52498o0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52500q0);
            }
            if ((this.f52498o0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.f52501r0);
            }
            if ((this.f52498o0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(4, this.f52502s0.getNumber());
            }
            for (int i11 = 0; i11 < this.f52503t0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, (MessageLite) this.f52503t0.get(i11));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < this.f52504u0.size(); i12++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(((Integer) this.f52504u0.get(i12)).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getUpperBoundIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f52505v0 = iComputeInt32SizeNoTag;
            int size = this.f52497Z.size() + m18284a() + iComputeInt32SizeNoTag2;
            this.f52507x0 = size;
            return size;
        }

        public Type getUpperBound(int i10) {
            return (Type) this.f52503t0.get(i10);
        }

        public int getUpperBoundCount() {
            return this.f52503t0.size();
        }

        public List<Integer> getUpperBoundIdList() {
            return this.f52504u0;
        }

        public List<Type> getUpperBoundList() {
            return this.f52503t0;
        }

        public Variance getVariance() {
            return this.f52502s0;
        }

        public boolean hasId() {
            return (this.f52498o0 & 1) == 1;
        }

        public boolean hasName() {
            return (this.f52498o0 & 2) == 2;
        }

        public boolean hasReified() {
            return (this.f52498o0 & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.f52498o0 & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52506w0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasId()) {
                this.f52506w0 = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.f52506w0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getUpperBoundCount(); i10++) {
                if (!getUpperBound(i10).isInitialized()) {
                    this.f52506w0 = (byte) 0;
                    return false;
                }
            }
            if (this.f52735Y.m18301f()) {
                this.f52506w0 = (byte) 1;
                return true;
            }
            this.f52506w0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52498o0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52499p0);
            }
            if ((this.f52498o0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f52500q0);
            }
            if ((this.f52498o0 & 4) == 4) {
                codedOutputStream.writeBool(3, this.f52501r0);
            }
            if ((this.f52498o0 & 8) == 8) {
                codedOutputStream.writeEnum(4, this.f52502s0.getNumber());
            }
            for (int i10 = 0; i10 < this.f52503t0.size(); i10++) {
                codedOutputStream.writeMessage(5, (MessageLite) this.f52503t0.get(i10));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.f52505v0);
            }
            for (int i11 = 0; i11 < this.f52504u0.size(); i11++) {
                codedOutputStream.writeInt32NoTag(((Integer) this.f52504u0.get(i11)).intValue());
            }
            extensionWriter.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52497Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeParameter getDefaultInstanceForType() {
            return f52496y0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public TypeParameter() {
            this.f52505v0 = -1;
            this.f52506w0 = (byte) -1;
            this.f52507x0 = -1;
            this.f52497Z = ByteString.EMPTY;
        }

        public TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52505v0 = -1;
            this.f52506w0 = (byte) -1;
            this.f52507x0 = -1;
            boolean z6 = false;
            this.f52499p0 = 0;
            this.f52500q0 = 0;
            this.f52501r0 = false;
            this.f52502s0 = Variance.INV;
            this.f52503t0 = Collections.emptyList();
            this.f52504u0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            int i10 = 0;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f52498o0 |= 1;
                                this.f52499p0 = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f52498o0 |= 2;
                                this.f52500q0 = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.f52498o0 |= 4;
                                this.f52501r0 = codedInputStream.readBool();
                            } else if (tag == 32) {
                                int i11 = codedInputStream.readEnum();
                                Variance varianceValueOf = Variance.valueOf(i11);
                                if (varianceValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.f52498o0 |= 8;
                                    this.f52502s0 = varianceValueOf;
                                }
                            } else if (tag == 42) {
                                if ((i10 & 16) != 16) {
                                    this.f52503t0 = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f52503t0.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag == 48) {
                                if ((i10 & 32) != 32) {
                                    this.f52504u0 = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f52504u0.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag != 50) {
                                if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52504u0 = new ArrayList();
                                    i10 |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f52504u0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 16) == 16) {
                            this.f52503t0 = DesugarCollections.unmodifiableList(this.f52503t0);
                        }
                        if ((i10 & 32) == 32) {
                            this.f52504u0 = DesugarCollections.unmodifiableList(this.f52504u0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52497Z = outputNewOutput.toByteString();
                        }
                        m18285b();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i10 & 16) == 16) {
                this.f52503t0 = DesugarCollections.unmodifiableList(this.f52503t0);
            }
            if ((i10 & 32) == 32) {
                this.f52504u0 = DesugarCollections.unmodifiableList(this.f52504u0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52497Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new C16600u();

        /* JADX INFO: renamed from: s0 */
        public static final TypeTable f52518s0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52519Y;

        /* JADX INFO: renamed from: Z */
        public int f52520Z;

        /* JADX INFO: renamed from: o0 */
        public List f52521o0;

        /* JADX INFO: renamed from: p0 */
        public int f52522p0;

        /* JADX INFO: renamed from: q0 */
        public byte f52523q0;

        /* JADX INFO: renamed from: r0 */
        public int f52524r0;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52525Z;

            /* JADX INFO: renamed from: o0 */
            public List f52526o0 = Collections.emptyList();

            /* JADX INFO: renamed from: p0 */
            public int f52527p0 = -1;

            public TypeTable buildPartial() {
                TypeTable typeTable = new TypeTable(this);
                int i10 = this.f52525Z;
                if ((i10 & 1) == 1) {
                    this.f52526o0 = DesugarCollections.unmodifiableList(this.f52526o0);
                    this.f52525Z &= -2;
                }
                typeTable.f52521o0 = this.f52526o0;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                typeTable.f52522p0 = this.f52527p0;
                typeTable.f52520Z = i11;
                return typeTable;
            }

            public Type getType(int i10) {
                return (Type) this.f52526o0.get(i10);
            }

            public int getTypeCount() {
                return this.f52526o0.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getTypeCount(); i10++) {
                    if (!getType(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setFirstNullable(int i10) {
                this.f52525Z |= 2;
                this.f52527p0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeTable build() {
                TypeTable typeTableBuildPartial = buildPartial();
                if (typeTableBuildPartial.isInitialized()) {
                    return typeTableBuildPartial;
                }
                throw new UninitializedMessageException(typeTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.f52521o0.isEmpty()) {
                    if (this.f52526o0.isEmpty()) {
                        this.f52526o0 = typeTable.f52521o0;
                        this.f52525Z &= -2;
                    } else {
                        if ((this.f52525Z & 1) != 1) {
                            this.f52526o0 = new ArrayList(this.f52526o0);
                            this.f52525Z |= 1;
                        }
                        this.f52526o0.addAll(typeTable.f52521o0);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.f52519Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        TypeTable partialFrom = TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        TypeTable typeTable2 = (TypeTable) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                mergeFrom(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeTable != null) {
                        mergeFrom(typeTable);
                    }
                    throw th;
                }
            }
        }

        static {
            TypeTable typeTable = new TypeTable();
            f52518s0 = typeTable;
            typeTable.f52521o0 = Collections.emptyList();
            typeTable.f52522p0 = -1;
        }

        public TypeTable() {
            this.f52523q0 = (byte) -1;
            this.f52524r0 = -1;
            this.f52519Y = ByteString.EMPTY;
        }

        public static TypeTable getDefaultInstance() {
            return f52518s0;
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        public int getFirstNullable() {
            return this.f52522p0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52524r0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = 0;
            for (int i11 = 0; i11 < this.f52521o0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f52521o0.get(i11));
            }
            if ((this.f52520Z & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52522p0);
            }
            int size = this.f52519Y.size() + iComputeInt32Size;
            this.f52524r0 = size;
            return size;
        }

        public Type getType(int i10) {
            return (Type) this.f52521o0.get(i10);
        }

        public int getTypeCount() {
            return this.f52521o0.size();
        }

        public List<Type> getTypeList() {
            return this.f52521o0;
        }

        public boolean hasFirstNullable() {
            return (this.f52520Z & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52523q0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getTypeCount(); i10++) {
                if (!getType(i10).isInitialized()) {
                    this.f52523q0 = (byte) 0;
                    return false;
                }
            }
            this.f52523q0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f52521o0.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f52521o0.get(i10));
            }
            if ((this.f52520Z & 1) == 1) {
                codedOutputStream.writeInt32(2, this.f52522p0);
            }
            codedOutputStream.writeRawBytes(this.f52519Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeTable getDefaultInstanceForType() {
            return f52518s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52523q0 = (byte) -1;
            this.f52524r0 = -1;
            this.f52521o0 = Collections.emptyList();
            this.f52522p0 = -1;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            boolean z10 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if (!z10) {
                                    this.f52521o0 = new ArrayList();
                                    z10 = true;
                                }
                                this.f52521o0.add(codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag != 16) {
                                if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                this.f52520Z |= 1;
                                this.f52522p0 = codedInputStream.readInt32();
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        if (z10) {
                            this.f52521o0 = DesugarCollections.unmodifiableList(this.f52521o0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52519Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z10) {
                this.f52521o0 = DesugarCollections.unmodifiableList(this.f52521o0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52519Y = outputNewOutput.toByteString();
            }
        }

        public TypeTable(Builder builder) {
            this.f52523q0 = (byte) -1;
            this.f52524r0 = -1;
            this.f52519Y = builder.getUnknownFields();
        }
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static Parser<ValueParameter> PARSER = new C16601v();

        /* JADX INFO: renamed from: x0 */
        public static final ValueParameter f52528x0;

        /* JADX INFO: renamed from: Z */
        public final ByteString f52529Z;

        /* JADX INFO: renamed from: o0 */
        public int f52530o0;

        /* JADX INFO: renamed from: p0 */
        public int f52531p0;

        /* JADX INFO: renamed from: q0 */
        public int f52532q0;

        /* JADX INFO: renamed from: r0 */
        public Type f52533r0;

        /* JADX INFO: renamed from: s0 */
        public int f52534s0;

        /* JADX INFO: renamed from: t0 */
        public Type f52535t0;

        /* JADX INFO: renamed from: u0 */
        public int f52536u0;

        /* JADX INFO: renamed from: v0 */
        public byte f52537v0;

        /* JADX INFO: renamed from: w0 */
        public int f52538w0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {

            /* JADX INFO: renamed from: p0 */
            public int f52539p0;

            /* JADX INFO: renamed from: q0 */
            public int f52540q0;

            /* JADX INFO: renamed from: r0 */
            public int f52541r0;

            /* JADX INFO: renamed from: t0 */
            public int f52543t0;

            /* JADX INFO: renamed from: v0 */
            public int f52545v0;

            /* JADX INFO: renamed from: s0 */
            public Type f52542s0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: u0 */
            public Type f52544u0 = Type.getDefaultInstance();

            public ValueParameter buildPartial() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i10 = this.f52539p0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                valueParameter.f52531p0 = this.f52540q0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                valueParameter.f52532q0 = this.f52541r0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                valueParameter.f52533r0 = this.f52542s0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                valueParameter.f52534s0 = this.f52543t0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                valueParameter.f52535t0 = this.f52544u0;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                valueParameter.f52536u0 = this.f52545v0;
                valueParameter.f52530o0 = i11;
                return valueParameter;
            }

            public Type getType() {
                return this.f52542s0;
            }

            public Type getVarargElementType() {
                return this.f52544u0;
            }

            public boolean hasName() {
                return (this.f52539p0 & 2) == 2;
            }

            public boolean hasType() {
                return (this.f52539p0 & 4) == 4;
            }

            public boolean hasVarargElementType() {
                return (this.f52539p0 & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    return (!hasVarargElementType() || getVarargElementType().isInitialized()) && this.f52733Z.m18301f();
                }
                return false;
            }

            public Builder mergeType(Type type) {
                if ((this.f52539p0 & 4) != 4 || this.f52542s0 == Type.getDefaultInstance()) {
                    this.f52542s0 = type;
                } else {
                    this.f52542s0 = Type.newBuilder(this.f52542s0).mergeFrom(type).buildPartial();
                }
                this.f52539p0 |= 4;
                return this;
            }

            public Builder mergeVarargElementType(Type type) {
                if ((this.f52539p0 & 16) != 16 || this.f52544u0 == Type.getDefaultInstance()) {
                    this.f52544u0 = type;
                } else {
                    this.f52544u0 = Type.newBuilder(this.f52544u0).mergeFrom(type).buildPartial();
                }
                this.f52539p0 |= 16;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f52539p0 |= 1;
                this.f52540q0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f52539p0 |= 2;
                this.f52541r0 = i10;
                return this;
            }

            public Builder setTypeId(int i10) {
                this.f52539p0 |= 8;
                this.f52543t0 = i10;
                return this;
            }

            public Builder setVarargElementTypeId(int i10) {
                this.f52539p0 |= 32;
                this.f52545v0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public ValueParameter build() {
                ValueParameter valueParameterBuildPartial = buildPartial();
                if (valueParameterBuildPartial.isInitialized()) {
                    return valueParameterBuildPartial;
                }
                throw new UninitializedMessageException(valueParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                m18283a(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.f52529Z));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ValueParameter partialFrom = ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        ValueParameter valueParameter2 = (ValueParameter) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                mergeFrom(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (valueParameter != null) {
                        mergeFrom(valueParameter);
                    }
                    throw th;
                }
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter();
            f52528x0 = valueParameter;
            valueParameter.f52531p0 = 0;
            valueParameter.f52532q0 = 0;
            valueParameter.f52533r0 = Type.getDefaultInstance();
            valueParameter.f52534s0 = 0;
            valueParameter.f52535t0 = Type.getDefaultInstance();
            valueParameter.f52536u0 = 0;
        }

        public ValueParameter(Builder builder) {
            super(builder);
            this.f52537v0 = (byte) -1;
            this.f52538w0 = -1;
            this.f52529Z = builder.getUnknownFields();
        }

        public static ValueParameter getDefaultInstance() {
            return f52528x0;
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        public int getFlags() {
            return this.f52531p0;
        }

        public int getName() {
            return this.f52532q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52538w0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52530o0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52531p0) : 0;
            if ((this.f52530o0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52532q0);
            }
            if ((this.f52530o0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f52533r0);
            }
            if ((this.f52530o0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f52535t0);
            }
            if ((this.f52530o0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f52534s0);
            }
            if ((this.f52530o0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.f52536u0);
            }
            int size = this.f52529Z.size() + m18284a() + iComputeInt32Size;
            this.f52538w0 = size;
            return size;
        }

        public Type getType() {
            return this.f52533r0;
        }

        public int getTypeId() {
            return this.f52534s0;
        }

        public Type getVarargElementType() {
            return this.f52535t0;
        }

        public int getVarargElementTypeId() {
            return this.f52536u0;
        }

        public boolean hasFlags() {
            return (this.f52530o0 & 1) == 1;
        }

        public boolean hasName() {
            return (this.f52530o0 & 2) == 2;
        }

        public boolean hasType() {
            return (this.f52530o0 & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.f52530o0 & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.f52530o0 & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.f52530o0 & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52537v0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!hasName()) {
                this.f52537v0 = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.f52537v0 = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.f52537v0 = (byte) 0;
                return false;
            }
            if (this.f52735Y.m18301f()) {
                this.f52537v0 = (byte) 1;
                return true;
            }
            this.f52537v0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage.ExtensionWriter extensionWriter = new GeneratedMessageLite.ExtendableMessage.ExtensionWriter(this);
            if ((this.f52530o0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52531p0);
            }
            if ((this.f52530o0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f52532q0);
            }
            if ((this.f52530o0 & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f52533r0);
            }
            if ((this.f52530o0 & 16) == 16) {
                codedOutputStream.writeMessage(4, this.f52535t0);
            }
            if ((this.f52530o0 & 8) == 8) {
                codedOutputStream.writeInt32(5, this.f52534s0);
            }
            if ((this.f52530o0 & 32) == 32) {
                codedOutputStream.writeInt32(6, this.f52536u0);
            }
            extensionWriter.writeUntil(RCHTTPStatusCodes.SUCCESS, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f52529Z);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public ValueParameter getDefaultInstanceForType() {
            return f52528x0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public ValueParameter() {
            this.f52537v0 = (byte) -1;
            this.f52538w0 = -1;
            this.f52529Z = ByteString.EMPTY;
        }

        public ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            Type.Builder builder;
            this.f52537v0 = (byte) -1;
            this.f52538w0 = -1;
            boolean z6 = false;
            this.f52531p0 = 0;
            this.f52532q0 = 0;
            this.f52533r0 = Type.getDefaultInstance();
            this.f52534s0 = 0;
            this.f52535t0 = Type.getDefaultInstance();
            this.f52536u0 = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f52530o0 |= 1;
                                this.f52531p0 = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (tag == 26) {
                                    builder = (this.f52530o0 & 4) == 4 ? this.f52533r0.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f52533r0 = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.f52533r0 = builder.buildPartial();
                                    }
                                    this.f52530o0 |= 4;
                                } else if (tag == 34) {
                                    builder = (this.f52530o0 & 16) == 16 ? this.f52535t0.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f52535t0 = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.f52535t0 = builder.buildPartial();
                                    }
                                    this.f52530o0 |= 16;
                                } else if (tag == 40) {
                                    this.f52530o0 |= 8;
                                    this.f52534s0 = codedInputStream.readInt32();
                                } else if (tag != 48) {
                                    if (!m18286c(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f52530o0 |= 32;
                                    this.f52536u0 = codedInputStream.readInt32();
                                }
                            } else {
                                this.f52530o0 |= 2;
                                this.f52532q0 = codedInputStream.readInt32();
                            }
                        }
                        z6 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f52529Z = outputNewOutput.toByteString();
                    }
                    m18285b();
                    throw th2;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52529Z = outputNewOutput.toByteString();
            }
            m18285b();
        }
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static Parser<VersionRequirement> PARSER = new C16602w();

        /* JADX INFO: renamed from: w0 */
        public static final VersionRequirement f52546w0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52547Y;

        /* JADX INFO: renamed from: Z */
        public int f52548Z;

        /* JADX INFO: renamed from: o0 */
        public int f52549o0;

        /* JADX INFO: renamed from: p0 */
        public int f52550p0;

        /* JADX INFO: renamed from: q0 */
        public Level f52551q0;

        /* JADX INFO: renamed from: r0 */
        public int f52552r0;

        /* JADX INFO: renamed from: s0 */
        public int f52553s0;

        /* JADX INFO: renamed from: t0 */
        public VersionKind f52554t0;

        /* JADX INFO: renamed from: u0 */
        public byte f52555u0;

        /* JADX INFO: renamed from: v0 */
        public int f52556v0;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52557Z;

            /* JADX INFO: renamed from: o0 */
            public int f52558o0;

            /* JADX INFO: renamed from: p0 */
            public int f52559p0;

            /* JADX INFO: renamed from: r0 */
            public int f52561r0;

            /* JADX INFO: renamed from: s0 */
            public int f52562s0;

            /* JADX INFO: renamed from: q0 */
            public Level f52560q0 = Level.ERROR;

            /* JADX INFO: renamed from: t0 */
            public VersionKind f52563t0 = VersionKind.LANGUAGE_VERSION;

            public VersionRequirement buildPartial() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i10 = this.f52557Z;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                versionRequirement.f52549o0 = this.f52558o0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                versionRequirement.f52550p0 = this.f52559p0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                versionRequirement.f52551q0 = this.f52560q0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                versionRequirement.f52552r0 = this.f52561r0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                versionRequirement.f52553s0 = this.f52562s0;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                versionRequirement.f52554t0 = this.f52563t0;
                versionRequirement.f52548Z = i11;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setErrorCode(int i10) {
                this.f52557Z |= 8;
                this.f52561r0 = i10;
                return this;
            }

            public Builder setLevel(Level level) {
                level.getClass();
                this.f52557Z |= 4;
                this.f52560q0 = level;
                return this;
            }

            public Builder setMessage(int i10) {
                this.f52557Z |= 16;
                this.f52562s0 = i10;
                return this;
            }

            public Builder setVersion(int i10) {
                this.f52557Z |= 1;
                this.f52558o0 = i10;
                return this;
            }

            public Builder setVersionFull(int i10) {
                this.f52557Z |= 2;
                this.f52559p0 = i10;
                return this;
            }

            public Builder setVersionKind(VersionKind versionKind) {
                versionKind.getClass();
                this.f52557Z |= 32;
                this.f52563t0 = versionKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirement build() {
                VersionRequirement versionRequirementBuildPartial = buildPartial();
                if (versionRequirementBuildPartial.isInitialized()) {
                    return versionRequirementBuildPartial;
                }
                throw new UninitializedMessageException(versionRequirementBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.f52547Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        VersionRequirement partialFrom = VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                mergeFrom(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirement != null) {
                        mergeFrom(versionRequirement);
                    }
                    throw th;
                }
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);


            /* JADX INFO: renamed from: Y */
            public final int f52565Y;

            Level(int i10) {
                this.f52565Y = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f52565Y;
            }

            public static Level valueOf(int i10) {
                if (i10 == 0) {
                    return WARNING;
                }
                if (i10 == 1) {
                    return ERROR;
                }
                if (i10 != 2) {
                    return null;
                }
                return HIDDEN;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);


            /* JADX INFO: renamed from: Y */
            public final int f52567Y;

            VersionKind(int i10) {
                this.f52567Y = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.f52567Y;
            }

            public static VersionKind valueOf(int i10) {
                if (i10 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i10 == 1) {
                    return COMPILER_VERSION;
                }
                if (i10 != 2) {
                    return null;
                }
                return API_VERSION;
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement();
            f52546w0 = versionRequirement;
            versionRequirement.f52549o0 = 0;
            versionRequirement.f52550p0 = 0;
            versionRequirement.f52551q0 = Level.ERROR;
            versionRequirement.f52552r0 = 0;
            versionRequirement.f52553s0 = 0;
            versionRequirement.f52554t0 = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement() {
            this.f52555u0 = (byte) -1;
            this.f52556v0 = -1;
            this.f52547Y = ByteString.EMPTY;
        }

        public static VersionRequirement getDefaultInstance() {
            return f52546w0;
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        public int getErrorCode() {
            return this.f52552r0;
        }

        public Level getLevel() {
            return this.f52551q0;
        }

        public int getMessage() {
            return this.f52553s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52556v0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f52548Z & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f52549o0) : 0;
            if ((this.f52548Z & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f52550p0);
            }
            if ((this.f52548Z & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f52551q0.getNumber());
            }
            if ((this.f52548Z & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f52552r0);
            }
            if ((this.f52548Z & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f52553s0);
            }
            if ((this.f52548Z & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(6, this.f52554t0.getNumber());
            }
            int size = this.f52547Y.size() + iComputeInt32Size;
            this.f52556v0 = size;
            return size;
        }

        public int getVersion() {
            return this.f52549o0;
        }

        public int getVersionFull() {
            return this.f52550p0;
        }

        public VersionKind getVersionKind() {
            return this.f52554t0;
        }

        public boolean hasErrorCode() {
            return (this.f52548Z & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.f52548Z & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.f52548Z & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.f52548Z & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.f52548Z & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.f52548Z & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52555u0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f52555u0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            if ((this.f52548Z & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f52549o0);
            }
            if ((this.f52548Z & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f52550p0);
            }
            if ((this.f52548Z & 4) == 4) {
                codedOutputStream.writeEnum(3, this.f52551q0.getNumber());
            }
            if ((this.f52548Z & 8) == 8) {
                codedOutputStream.writeInt32(4, this.f52552r0);
            }
            if ((this.f52548Z & 16) == 16) {
                codedOutputStream.writeInt32(5, this.f52553s0);
            }
            if ((this.f52548Z & 32) == 32) {
                codedOutputStream.writeEnum(6, this.f52554t0.getNumber());
            }
            codedOutputStream.writeRawBytes(this.f52547Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirement getDefaultInstanceForType() {
            return f52546w0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public VersionRequirement(CodedInputStream codedInputStream) {
            this.f52555u0 = (byte) -1;
            this.f52556v0 = -1;
            boolean z6 = false;
            this.f52549o0 = 0;
            this.f52550p0 = 0;
            this.f52551q0 = Level.ERROR;
            this.f52552r0 = 0;
            this.f52553s0 = 0;
            this.f52554t0 = VersionKind.LANGUAGE_VERSION;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f52548Z |= 1;
                                this.f52549o0 = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f52548Z |= 2;
                                this.f52550p0 = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i10 = codedInputStream.readEnum();
                                Level levelValueOf = Level.valueOf(i10);
                                if (levelValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i10);
                                } else {
                                    this.f52548Z |= 4;
                                    this.f52551q0 = levelValueOf;
                                }
                            } else if (tag == 32) {
                                this.f52548Z |= 8;
                                this.f52552r0 = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.f52548Z |= 16;
                                this.f52553s0 = codedInputStream.readInt32();
                            } else if (tag != 48) {
                                if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                int i11 = codedInputStream.readEnum();
                                VersionKind versionKindValueOf = VersionKind.valueOf(i11);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.f52548Z |= 32;
                                    this.f52554t0 = versionKindValueOf;
                                }
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52547Y = outputNewOutput.toByteString();
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
                this.f52547Y = outputNewOutput.toByteString();
            }
        }

        public VersionRequirement(Builder builder) {
            this.f52555u0 = (byte) -1;
            this.f52556v0 = -1;
            this.f52547Y = builder.getUnknownFields();
        }
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new C16603x();

        /* JADX INFO: renamed from: q0 */
        public static final VersionRequirementTable f52568q0;

        /* JADX INFO: renamed from: Y */
        public final ByteString f52569Y;

        /* JADX INFO: renamed from: Z */
        public List f52570Z;

        /* JADX INFO: renamed from: o0 */
        public byte f52571o0;

        /* JADX INFO: renamed from: p0 */
        public int f52572p0;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* JADX INFO: renamed from: Z */
            public int f52573Z;

            /* JADX INFO: renamed from: o0 */
            public List f52574o0 = Collections.emptyList();

            public VersionRequirementTable buildPartial() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f52573Z & 1) == 1) {
                    this.f52574o0 = DesugarCollections.unmodifiableList(this.f52574o0);
                    this.f52573Z &= -2;
                }
                versionRequirementTable.f52570Z = this.f52574o0;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableBuildPartial = buildPartial();
                if (versionRequirementTableBuildPartial.isInitialized()) {
                    return versionRequirementTableBuildPartial;
                }
                throw new UninitializedMessageException(versionRequirementTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo22588clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.f52570Z.isEmpty()) {
                    if (this.f52574o0.isEmpty()) {
                        this.f52574o0 = versionRequirementTable.f52570Z;
                        this.f52573Z &= -2;
                    } else {
                        if ((this.f52573Z & 1) != 1) {
                            this.f52574o0 = new ArrayList(this.f52574o0);
                            this.f52573Z |= 1;
                        }
                        this.f52574o0.addAll(versionRequirementTable.f52570Z);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.f52569Y));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        VersionRequirementTable partialFrom = VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e10.getUnfinishedMessage();
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                mergeFrom(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirementTable != null) {
                        mergeFrom(versionRequirementTable);
                    }
                    throw th;
                }
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable();
            f52568q0 = versionRequirementTable;
            versionRequirementTable.f52570Z = Collections.emptyList();
        }

        public VersionRequirementTable() {
            this.f52571o0 = (byte) -1;
            this.f52572p0 = -1;
            this.f52569Y = ByteString.EMPTY;
        }

        public static VersionRequirementTable getDefaultInstance() {
            return f52568q0;
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public int getRequirementCount() {
            return this.f52570Z.size();
        }

        public List<VersionRequirement> getRequirementList() {
            return this.f52570Z;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f52572p0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f52570Z.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f52570Z.get(i11));
            }
            int size = this.f52569Y.size() + iComputeMessageSize;
            this.f52572p0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b = this.f52571o0;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f52571o0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f52570Z.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f52570Z.get(i10));
            }
            codedOutputStream.writeRawBytes(this.f52569Y);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirementTable getDefaultInstanceForType() {
            return f52568q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this.f52571o0 = (byte) -1;
            this.f52572p0 = -1;
            this.f52570Z = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z6 = false;
            boolean z10 = false;
            while (!z6) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!codedInputStream.skipField(tag, codedOutputStreamNewInstance)) {
                                }
                            } else {
                                if (!z10) {
                                    this.f52570Z = new ArrayList();
                                    z10 = true;
                                }
                                this.f52570Z.add(codedInputStream.readMessage(VersionRequirement.PARSER, extensionRegistryLite));
                            }
                        }
                        z6 = true;
                    } catch (Throwable th2) {
                        if (z10) {
                            this.f52570Z = DesugarCollections.unmodifiableList(this.f52570Z);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f52569Y = outputNewOutput.toByteString();
                        }
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).setUnfinishedMessage(this);
                }
            }
            if (z10) {
                this.f52570Z = DesugarCollections.unmodifiableList(this.f52570Z);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f52569Y = outputNewOutput.toByteString();
            }
        }

        public VersionRequirementTable(Builder builder) {
            this.f52571o0 = (byte) -1;
            this.f52572p0 = -1;
            this.f52569Y = builder.getUnknownFields();
        }
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0),
        PRIVATE(1),
        PROTECTED(2),
        PUBLIC(3),
        PRIVATE_TO_THIS(4),
        LOCAL(5);


        /* JADX INFO: renamed from: Y */
        public final int f52576Y;

        Visibility(int i10) {
            this.f52576Y = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.f52576Y;
        }

        public static Visibility valueOf(int i10) {
            if (i10 == 0) {
                return INTERNAL;
            }
            if (i10 == 1) {
                return PRIVATE;
            }
            if (i10 == 2) {
                return PROTECTED;
            }
            if (i10 == 3) {
                return PUBLIC;
            }
            if (i10 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i10 != 5) {
                return null;
            }
            return LOCAL;
        }
    }
}
