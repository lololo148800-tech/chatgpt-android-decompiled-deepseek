package com.withpersona.sdk2.inquiry;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField;", "", "()V", "BooleanField", "ChoicesField", "DateField", "DatetimeField", "FloatField", "IntegerField", "MultiChoicesField", "StringField", "UnknownField", "Lcom/withpersona/sdk2/inquiry/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/InquiryField$UnknownField;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class InquiryField {

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "(Ljava/lang/Boolean;)V", "getValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class BooleanField extends InquiryField {
        private final Boolean value;

        public BooleanField(Boolean bool) {
            super(null);
            this.value = bool;
        }

        public final Boolean getValue() {
            return this.value;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class ChoicesField extends InquiryField {
        private final String value;

        public ChoicesField(String str) {
            super(null);
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "Ljava/util/Date;", "(Ljava/util/Date;)V", "getValue", "()Ljava/util/Date;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DateField extends InquiryField {
        private final Date value;

        public DateField(Date date) {
            super(null);
            this.value = date;
        }

        public final Date getValue() {
            return this.value;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "Ljava/util/Date;", "(Ljava/util/Date;)V", "getValue", "()Ljava/util/Date;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class DatetimeField extends InquiryField {
        private final Date value;

        public DatetimeField(Date date) {
            super(null);
            this.value = date;
        }

        public final Date getValue() {
            return this.value;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "(Ljava/lang/Float;)V", "getValue", "()Ljava/lang/Float;", "Ljava/lang/Float;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class FloatField extends InquiryField {
        private final Float value;

        public FloatField(Float f10) {
            super(null);
            this.value = f10;
        }

        public final Float getValue() {
            return this.value;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "(Ljava/lang/Integer;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class IntegerField extends InquiryField {
        private final Integer value;

        public IntegerField(Integer num) {
            super(null);
            this.value = num;
        }

        public final Integer getValue() {
            return this.value;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "", "([Ljava/lang/String;)V", "getValue", "()[Ljava/lang/String;", "[Ljava/lang/String;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class MultiChoicesField extends InquiryField {
        private final String[] value;

        public MultiChoicesField(String[] strArr) {
            super(null);
            this.value = strArr;
        }

        public final String[] getValue() {
            return this.value;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class StringField extends InquiryField {
        private final String value;

        public StringField(String str) {
            super(null);
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryField$UnknownField;", "Lcom/withpersona/sdk2/inquiry/InquiryField;", "type", "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class UnknownField extends InquiryField {
        private final String type;

        public UnknownField(String str) {
            super(null);
            this.type = str;
        }

        public final String getType() {
            return this.type;
        }
    }

    public /* synthetic */ InquiryField(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InquiryField() {
    }
}
