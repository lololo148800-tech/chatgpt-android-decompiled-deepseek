package com.withpersona.sdk2.inquiry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p247Jj.AbstractC4385H;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/Fields;", "", "", "", "LJj/H;", "fields", "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "getFields$inquiry_dynamic_feature_release", "()Ljava/util/Map;", "Builder", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Fields {
    private final Map<String, AbstractC4385H> fields;

    @Metadata(m18066d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\fJ\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000eJ\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000f¢\u0006\u0004\b\u0007\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\bJ#\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "", "<init>", "()V", "", DiagnosticsEntry.NAME_KEY, "value", "field", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "", "(Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "", "(Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "", "(Ljava/lang/String;F)Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "fieldChoices", "", "fieldMultiChoices", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/Fields$Builder;", "Lcom/withpersona/sdk2/inquiry/Fields;", "build", "()Lcom/withpersona/sdk2/inquiry/Fields;", "", "LJj/H;", "fields", "Ljava/util/Map;", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Builder {
        private final Map<String, AbstractC4385H> fields = new LinkedHashMap();

        public final Fields build() {
            return new Fields(this.fields, null);
        }

        public final Builder field(String name, String value) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(value, "value");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.internal.InquiryField$StringField(value, null, 2, null));
            return this;
        }

        public final Builder fieldChoices(String name, String value) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(value, "value");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.internal.InquiryField$ChoicesField(value, null, 2, null));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder fieldMultiChoices(String name, String[] value) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(value, "value");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.internal.InquiryField$MultiChoicesField(value, null, 2, 0 == true ? 1 : 0));
            return this;
        }

        public final Builder field(String name, int value) {
            AbstractC16544l.m18094g(name, "name");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.internal.InquiryField$IntegerField(Integer.valueOf(value), null, 2, null));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder field(String name, boolean value) {
            AbstractC16544l.m18094g(name, "name");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.internal.InquiryField$BooleanField(Boolean.valueOf(value), null, 2, 0 == true ? 1 : 0));
            return this;
        }

        public final Builder field(String name, float value) {
            AbstractC16544l.m18094g(name, "name");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.internal.InquiryField$FloatField(Float.valueOf(value), null, 2, null));
            return this;
        }

        public final Builder field(String name, Date value) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(value, "value");
            this.fields.put(name, new com.withpersona.sdk2.inquiry.internal.InquiryField$DateField(value.toString(), null, 2, null));
            return this;
        }
    }

    public /* synthetic */ Fields(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map<String, AbstractC4385H> getFields$inquiry_dynamic_feature_release() {
        return this.fields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Fields(Map<String, ? extends AbstractC4385H> map) {
        this.fields = map;
    }
}
