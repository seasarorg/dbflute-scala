package com.example.dbflute.scala.dbflute.allcommon;

import scala.collection.immutable;
import scala.collection.JavaConverters._;

import java.util._;

import org.seasar.dbflute.jdbc.Classification;
import org.seasar.dbflute.jdbc.ClassificationCodeType;
import org.seasar.dbflute.jdbc.ClassificationMeta;
import org.seasar.dbflute.jdbc.ClassificationUndefinedHandlingType;

/**
 * The definition of classification.
 * @author DBFlute(AutoGenerator)
 */
object CDef {

    /** The empty array for no sisters. */
    val EMPTY_SISTERS: Array[String] = Array[String]();

    /** The empty map for no sub-items. */
    val EMPTY_SUB_ITEM_MAP: Map[String, Object] = Collections.EMPTY_MAP.asInstanceOf[Map[String, Object]];

    sealed abstract class Flg(val code: String, val alias: String, val sisters: Array[String]) extends Classification {

        def name(): String = { return getClass().getSimpleName(); }
        def subItemMap(): Map[String, Object] = { return _subItemMapMap.get(code); }
        def meta(): ClassificationMeta = { return CDef.DefMeta.Flg; }

        def key1(): String = {
            return subItemMap().get("key1").asInstanceOf[String];
        }

        private val _subItemMapMap: Map[String, Map[String, Object]] = new HashMap();
        {
            {
                val subItemMap: Map[String, Object] = new HashMap();
                subItemMap.put("key1", "value1");
                _subItemMapMap.put("1", Collections.unmodifiableMap(subItemMap));
            }
            {
                val subItemMap: Map[String, Object] = new HashMap();
                subItemMap.put("key1", "value1");
                _subItemMapMap.put("0", Collections.unmodifiableMap(subItemMap));
            }
        }

        def inGroup(groupName: String): Boolean = {
            return false;
        }

        override def toString(): String = { return code; }
    }

    /**
     * general boolean classification for every flg-column
     */
    object Flg {

        /** Yes: means valid */
        case object True extends Flg("1", "Yes", EMPTY_SISTERS);
        /** No: means invalid */
        case object False extends Flg("0", "No", EMPTY_SISTERS);

        private val _codeValueMap: Map[String, Flg] = new HashMap();
        {
            _codeValueMap.put("1".toLowerCase(), True);
            _codeValueMap.put("0".toLowerCase(), False);
        }
        private val _nameValueMap: Map[String, Flg] = new HashMap();
        {
            _nameValueMap.put("True", True);
            _nameValueMap.put("False", False);
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        def codeOf(code: Object): Flg = {
            if (code == null) { return null; }
            if (code.isInstanceOf[Flg]) { return code.asInstanceOf[Flg]; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        def nameOf(name: String): Flg = {
            if (name == null) { return null; }
            return _nameValueMap.get(name);
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        def listAll(): scala.collection.immutable.List[Flg] = {
            return toScalaList(_nameValueMap.values());
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        def groupOf(groupName: String): scala.collection.immutable.List[Flg] = {
            return scala.collection.immutable.List[Flg]();
        }
    }

    sealed abstract class MemberStatus(val code: String, val alias: String, val sisters: Array[String]) extends Classification {

        def name(): String = { return getClass().getSimpleName(); }
        def subItemMap(): Map[String, Object] = { return _subItemMapMap.get(code); }
        def meta(): ClassificationMeta = { return CDef.DefMeta.MemberStatus; }

        def key1(): String = {
            return subItemMap().get("key1").asInstanceOf[String];
        }

        def key2(): String = {
            return subItemMap().get("key2").asInstanceOf[String];
        }

        private val _subItemMapMap: Map[String, Map[String, Object]] = new HashMap();
        {
            {
                val subItemMap: Map[String, Object] = new HashMap();
                subItemMap.put("key1", "1");
                subItemMap.put("key2", "as formal member, allowed to use all service");
                _subItemMapMap.put("FML", Collections.unmodifiableMap(subItemMap));
            }
            {
                val subItemMap: Map[String, Object] = new HashMap();
                subItemMap.put("key1", "2");
                subItemMap.put("key2", "withdrawal is fixed, not allowed to use service");
                _subItemMapMap.put("WDL", Collections.unmodifiableMap(subItemMap));
            }
            {
                val subItemMap: Map[String, Object] = new HashMap();
                subItemMap.put("key1", "3");
                subItemMap.put("key2", "first status after entry, allowed to use only part of service");
                _subItemMapMap.put("PRV", Collections.unmodifiableMap(subItemMap));
            }
        }

        def inGroup(groupName: String): Boolean = {
            return false;
        }

        override def toString(): String = { return code; }
    }

    /**
     * status of member from entry to withdrawal
     */
    object MemberStatus {

        /** Formalized: as formal member, allowed to use all service */
        case object Formalized extends MemberStatus("FML", "Formalized", EMPTY_SISTERS);
        /** Withdrawal: withdrawal is fixed, not allowed to use service */
        case object Withdrawal extends MemberStatus("WDL", "Withdrawal", EMPTY_SISTERS);
        /** Provisional: first status after entry, allowed to use only part of service */
        case object Provisional extends MemberStatus("PRV", "Provisional", EMPTY_SISTERS);

        private val _codeValueMap: Map[String, MemberStatus] = new HashMap();
        {
            _codeValueMap.put("FML".toLowerCase(), Formalized);
            _codeValueMap.put("WDL".toLowerCase(), Withdrawal);
            _codeValueMap.put("PRV".toLowerCase(), Provisional);
        }
        private val _nameValueMap: Map[String, MemberStatus] = new HashMap();
        {
            _nameValueMap.put("Formalized", Formalized);
            _nameValueMap.put("Withdrawal", Withdrawal);
            _nameValueMap.put("Provisional", Provisional);
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        def codeOf(code: Object): MemberStatus = {
            if (code == null) { return null; }
            if (code.isInstanceOf[MemberStatus]) { return code.asInstanceOf[MemberStatus]; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        def nameOf(name: String): MemberStatus = {
            if (name == null) { return null; }
            return _nameValueMap.get(name);
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        def listAll(): scala.collection.immutable.List[MemberStatus] = {
            return toScalaList(_nameValueMap.values());
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        def groupOf(groupName: String): scala.collection.immutable.List[MemberStatus] = {
            return scala.collection.immutable.List[MemberStatus]();
        }
    }

    sealed abstract class ServiceRank(val code: String, val alias: String, val sisters: Array[String]) extends Classification {

        def name(): String = { return getClass().getSimpleName(); }
        def subItemMap(): Map[String, Object] = { return EMPTY_SUB_ITEM_MAP; }
        def meta(): ClassificationMeta = { return CDef.DefMeta.ServiceRank; }


        def inGroup(groupName: String): Boolean = {
            return false;
        }

        override def toString(): String = { return code; }
    }

    /**
     * rank of service member gets
     */
    object ServiceRank {

        /** PLATINUM: platinum rank */
        case object Platinum extends ServiceRank("PLT", "PLATINUM", EMPTY_SISTERS);
        /** GOLD: gold rank */
        case object Gold extends ServiceRank("GLD", "GOLD", EMPTY_SISTERS);
        /** SILVER: silver rank */
        case object Silver extends ServiceRank("SIL", "SILVER", EMPTY_SISTERS);
        /** BRONZE: bronze rank */
        case object Bronze extends ServiceRank("BRZ", "BRONZE", EMPTY_SISTERS);
        /** PLASTIC: plastic rank */
        case object Plastic extends ServiceRank("PLS", "PLASTIC", EMPTY_SISTERS);

        private val _codeValueMap: Map[String, ServiceRank] = new HashMap();
        {
            _codeValueMap.put("PLT".toLowerCase(), Platinum);
            _codeValueMap.put("GLD".toLowerCase(), Gold);
            _codeValueMap.put("SIL".toLowerCase(), Silver);
            _codeValueMap.put("BRZ".toLowerCase(), Bronze);
            _codeValueMap.put("PLS".toLowerCase(), Plastic);
        }
        private val _nameValueMap: Map[String, ServiceRank] = new HashMap();
        {
            _nameValueMap.put("Platinum", Platinum);
            _nameValueMap.put("Gold", Gold);
            _nameValueMap.put("Silver", Silver);
            _nameValueMap.put("Bronze", Bronze);
            _nameValueMap.put("Plastic", Plastic);
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        def codeOf(code: Object): ServiceRank = {
            if (code == null) { return null; }
            if (code.isInstanceOf[ServiceRank]) { return code.asInstanceOf[ServiceRank]; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        def nameOf(name: String): ServiceRank = {
            if (name == null) { return null; }
            return _nameValueMap.get(name);
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        def listAll(): scala.collection.immutable.List[ServiceRank] = {
            return toScalaList(_nameValueMap.values());
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        def groupOf(groupName: String): scala.collection.immutable.List[ServiceRank] = {
            return scala.collection.immutable.List[ServiceRank]();
        }
    }

    sealed abstract class Region(val code: String, val alias: String, val sisters: Array[String]) extends Classification {

        def name(): String = { return getClass().getSimpleName(); }
        def subItemMap(): Map[String, Object] = { return EMPTY_SUB_ITEM_MAP; }
        def meta(): ClassificationMeta = { return CDef.DefMeta.Region; }


        def inGroup(groupName: String): Boolean = {
            return false;
        }

        override def toString(): String = { return code; }
    }

    /**
     * mainly region of member address
     */
    object Region {

        /** AMERICA */
        case object America extends Region("1", "AMERICA", EMPTY_SISTERS);
        /** CANADA */
        case object Canada extends Region("2", "CANADA", EMPTY_SISTERS);
        /** CHINA */
        case object China extends Region("3", "CHINA", EMPTY_SISTERS);
        /** CHIBA */
        case object Chiba extends Region("4", "CHIBA", EMPTY_SISTERS);

        private val _codeValueMap: Map[String, Region] = new HashMap();
        {
            _codeValueMap.put("1".toLowerCase(), America);
            _codeValueMap.put("2".toLowerCase(), Canada);
            _codeValueMap.put("3".toLowerCase(), China);
            _codeValueMap.put("4".toLowerCase(), Chiba);
        }
        private val _nameValueMap: Map[String, Region] = new HashMap();
        {
            _nameValueMap.put("America", America);
            _nameValueMap.put("Canada", Canada);
            _nameValueMap.put("China", China);
            _nameValueMap.put("Chiba", Chiba);
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        def codeOf(code: Object): Region = {
            if (code == null) { return null; }
            if (code.isInstanceOf[Region]) { return code.asInstanceOf[Region]; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        def nameOf(name: String): Region = {
            if (name == null) { return null; }
            return _nameValueMap.get(name);
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        def listAll(): scala.collection.immutable.List[Region] = {
            return toScalaList(_nameValueMap.values());
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        def groupOf(groupName: String): scala.collection.immutable.List[Region] = {
            return scala.collection.immutable.List[Region]();
        }
    }

    sealed abstract class WithdrawalReason(val code: String, val alias: String, val sisters: Array[String]) extends Classification {

        def name(): String = { return getClass().getSimpleName(); }
        def subItemMap(): Map[String, Object] = { return EMPTY_SUB_ITEM_MAP; }
        def meta(): ClassificationMeta = { return CDef.DefMeta.WithdrawalReason; }


        def inGroup(groupName: String): Boolean = {
            return false;
        }

        override def toString(): String = { return code; }
    }

    /**
     * reason for member withdrawal
     */
    object WithdrawalReason {

        /** SIT: サイトが使いにくいから */
        case object Sit extends WithdrawalReason("SIT", "SIT", EMPTY_SISTERS);
        /** PRD: 商品に魅力がないから */
        case object Prd extends WithdrawalReason("PRD", "PRD", EMPTY_SISTERS);
        /** FRT: フリテンだから */
        case object Frt extends WithdrawalReason("FRT", "FRT", EMPTY_SISTERS);
        /** OTH: その他理由 */
        case object Oth extends WithdrawalReason("OTH", "OTH", EMPTY_SISTERS);

        private val _codeValueMap: Map[String, WithdrawalReason] = new HashMap();
        {
            _codeValueMap.put("SIT".toLowerCase(), Sit);
            _codeValueMap.put("PRD".toLowerCase(), Prd);
            _codeValueMap.put("FRT".toLowerCase(), Frt);
            _codeValueMap.put("OTH".toLowerCase(), Oth);
        }
        private val _nameValueMap: Map[String, WithdrawalReason] = new HashMap();
        {
            _nameValueMap.put("Sit", Sit);
            _nameValueMap.put("Prd", Prd);
            _nameValueMap.put("Frt", Frt);
            _nameValueMap.put("Oth", Oth);
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        def codeOf(code: Object): WithdrawalReason = {
            if (code == null) { return null; }
            if (code.isInstanceOf[WithdrawalReason]) { return code.asInstanceOf[WithdrawalReason]; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        def nameOf(name: String): WithdrawalReason = {
            if (name == null) { return null; }
            return _nameValueMap.get(name);
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        def listAll(): scala.collection.immutable.List[WithdrawalReason] = {
            return toScalaList(_nameValueMap.values());
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        def groupOf(groupName: String): scala.collection.immutable.List[WithdrawalReason] = {
            return scala.collection.immutable.List[WithdrawalReason]();
        }
    }

    sealed abstract class ProductCategory(val code: String, val alias: String, val sisters: Array[String]) extends Classification {

        def name(): String = { return getClass().getSimpleName(); }
        def subItemMap(): Map[String, Object] = { return EMPTY_SUB_ITEM_MAP; }
        def meta(): ClassificationMeta = { return CDef.DefMeta.ProductCategory; }


        def inGroup(groupName: String): Boolean = {
            return false;
        }

        override def toString(): String = { return code; }
    }

    /**
     * category of product. self reference
     */
    object ProductCategory {

        /** 音楽 */
        case object 音楽 extends ProductCategory("MSC", "音楽", EMPTY_SISTERS);
        /** 食品 */
        case object 食品 extends ProductCategory("FOD", "食品", EMPTY_SISTERS);
        /** ハーブ: of 食品 */
        case object ハーブ extends ProductCategory("HEB", "ハーブ", EMPTY_SISTERS);
        /** 音楽CD: of 音楽 */
        case object 音楽cd extends ProductCategory("MCD", "音楽CD", EMPTY_SISTERS);
        /** 楽器: of 音楽 */
        case object 楽器 extends ProductCategory("INS", "楽器", EMPTY_SISTERS);

        private val _codeValueMap: Map[String, ProductCategory] = new HashMap();
        {
            _codeValueMap.put("MSC".toLowerCase(), 音楽);
            _codeValueMap.put("FOD".toLowerCase(), 食品);
            _codeValueMap.put("HEB".toLowerCase(), ハーブ);
            _codeValueMap.put("MCD".toLowerCase(), 音楽cd);
            _codeValueMap.put("INS".toLowerCase(), 楽器);
        }
        private val _nameValueMap: Map[String, ProductCategory] = new HashMap();
        {
            _nameValueMap.put("音楽", 音楽);
            _nameValueMap.put("食品", 食品);
            _nameValueMap.put("ハーブ", ハーブ);
            _nameValueMap.put("音楽cd", 音楽cd);
            _nameValueMap.put("楽器", 楽器);
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        def codeOf(code: Object): ProductCategory = {
            if (code == null) { return null; }
            if (code.isInstanceOf[ProductCategory]) { return code.asInstanceOf[ProductCategory]; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        def nameOf(name: String): ProductCategory = {
            if (name == null) { return null; }
            return _nameValueMap.get(name);
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        def listAll(): scala.collection.immutable.List[ProductCategory] = {
            return toScalaList(_nameValueMap.values());
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        def groupOf(groupName: String): scala.collection.immutable.List[ProductCategory] = {
            return scala.collection.immutable.List[ProductCategory]();
        }
    }

    sealed abstract class ProductStatus(val code: String, val alias: String, val sisters: Array[String]) extends Classification {

        def name(): String = { return getClass().getSimpleName(); }
        def subItemMap(): Map[String, Object] = { return EMPTY_SUB_ITEM_MAP; }
        def meta(): ClassificationMeta = { return CDef.DefMeta.ProductStatus; }


        def inGroup(groupName: String): Boolean = {
            return false;
        }

        override def toString(): String = { return code; }
    }

    /**
     * status for product
     */
    object ProductStatus {

        /** ProductionSale */
        case object ProductionSale extends ProductStatus("ONS", "ProductionSale", EMPTY_SISTERS);
        /** StopProduction */
        case object StopProduction extends ProductStatus("PST", "StopProduction", EMPTY_SISTERS);
        /** StopSale */
        case object StopSale extends ProductStatus("SST", "StopSale", EMPTY_SISTERS);

        private val _codeValueMap: Map[String, ProductStatus] = new HashMap();
        {
            _codeValueMap.put("ONS".toLowerCase(), ProductionSale);
            _codeValueMap.put("PST".toLowerCase(), StopProduction);
            _codeValueMap.put("SST".toLowerCase(), StopSale);
        }
        private val _nameValueMap: Map[String, ProductStatus] = new HashMap();
        {
            _nameValueMap.put("ProductionSale", ProductionSale);
            _nameValueMap.put("StopProduction", StopProduction);
            _nameValueMap.put("StopSale", StopSale);
        }

        /**
         * Get the classification by the code. (CaseInsensitive)
         * @param code The value of code, which is case-insensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the code. (NullAllowed: if not found, returns null)
         */
        def codeOf(code: Object): ProductStatus = {
            if (code == null) { return null; }
            if (code.isInstanceOf[ProductStatus]) { return code.asInstanceOf[ProductStatus]; }
            return _codeValueMap.get(code.toString().toLowerCase());
        }

        /**
         * Get the classification by the name (also called 'value' in ENUM world).
         * @param name The string of name, which is case-sensitive. (NullAllowed: if null, returns null)
         * @return The instance of the corresponding classification to the name. (NullAllowed: if not found, returns null)
         */
        def nameOf(name: String): ProductStatus = {
            if (name == null) { return null; }
            return _nameValueMap.get(name);
        }

        /**
         * Get the list of all classification elements. (returns new copied list)
         * @return The list of all classification elements. (NotNull)
         */
        def listAll(): scala.collection.immutable.List[ProductStatus] = {
            return toScalaList(_nameValueMap.values());
        }

        /**
         * Get the list of classification elements in the specified group. (returns new copied list) <br />
         * @param groupName The string of group name, which is case-sensitive. (NullAllowed: if null, returns empty list)
         * @return The list of classification elements in the group. (NotNull)
         */
        def groupOf(groupName: String): scala.collection.immutable.List[ProductStatus] = {
            return scala.collection.immutable.List[ProductStatus]();
        }
    }

    sealed abstract class DefMeta(val name: String) extends ClassificationMeta {

        def classificationName(): String = {
            return this.name; // same as definition name
        }

        def codeOf(code: Object): Classification = {
            if ("Flg".equals(this.name)) { return CDef.Flg.codeOf(code).asInstanceOf[CDef.Flg]; }
            if ("MemberStatus".equals(this.name)) { return CDef.MemberStatus.codeOf(code).asInstanceOf[CDef.MemberStatus]; }
            if ("ServiceRank".equals(this.name)) { return CDef.ServiceRank.codeOf(code).asInstanceOf[CDef.ServiceRank]; }
            if ("Region".equals(this.name)) { return CDef.Region.codeOf(code).asInstanceOf[CDef.Region]; }
            if ("WithdrawalReason".equals(this.name)) { return CDef.WithdrawalReason.codeOf(code).asInstanceOf[CDef.WithdrawalReason]; }
            if ("ProductCategory".equals(this.name)) { return CDef.ProductCategory.codeOf(code).asInstanceOf[CDef.ProductCategory]; }
            if ("ProductStatus".equals(this.name)) { return CDef.ProductStatus.codeOf(code).asInstanceOf[CDef.ProductStatus]; }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        def nameOf(name: String): Classification = {
            if ("Flg".equals(this.name)) { return CDef.Flg.nameOf(name); }
            if ("MemberStatus".equals(this.name)) { return CDef.MemberStatus.nameOf(name); }
            if ("ServiceRank".equals(this.name)) { return CDef.ServiceRank.nameOf(name); }
            if ("Region".equals(this.name)) { return CDef.Region.nameOf(name); }
            if ("WithdrawalReason".equals(this.name)) { return CDef.WithdrawalReason.nameOf(name); }
            if ("ProductCategory".equals(this.name)) { return CDef.ProductCategory.nameOf(name); }
            if ("ProductStatus".equals(this.name)) { return CDef.ProductStatus.nameOf(name); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        def listAll(): List[Classification] = {
            if ("Flg".equals(this.name)) { return toClassificationList(CDef.Flg.listAll()); }
            if ("MemberStatus".equals(this.name)) { return toClassificationList(CDef.MemberStatus.listAll()); }
            if ("ServiceRank".equals(this.name)) { return toClassificationList(CDef.ServiceRank.listAll()); }
            if ("Region".equals(this.name)) { return toClassificationList(CDef.Region.listAll()); }
            if ("WithdrawalReason".equals(this.name)) { return toClassificationList(CDef.WithdrawalReason.listAll()); }
            if ("ProductCategory".equals(this.name)) { return toClassificationList(CDef.ProductCategory.listAll()); }
            if ("ProductStatus".equals(this.name)) { return toClassificationList(CDef.ProductStatus.listAll()); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        def groupOf(groupName: String): List[Classification] = {
            if ("Flg".equals(this.name)) { return toClassificationList(CDef.Flg.groupOf(groupName)); }
            if ("MemberStatus".equals(this.name)) { return toClassificationList(CDef.MemberStatus.groupOf(groupName)); }
            if ("ServiceRank".equals(this.name)) { return toClassificationList(CDef.ServiceRank.groupOf(groupName)); }
            if ("Region".equals(this.name)) { return toClassificationList(CDef.Region.groupOf(groupName)); }
            if ("WithdrawalReason".equals(this.name)) { return toClassificationList(CDef.WithdrawalReason.groupOf(groupName)); }
            if ("ProductCategory".equals(this.name)) { return toClassificationList(CDef.ProductCategory.groupOf(groupName)); }
            if ("ProductStatus".equals(this.name)) { return toClassificationList(CDef.ProductStatus.groupOf(groupName)); }
            throw new IllegalStateException("Unknown definition: " + this); // basically unreachable
        }

        private def toClassificationList(clsList: scala.collection.immutable.List[Classification]): List[Classification] = {
            return clsList.asJava;
        }

        def codeType(): ClassificationCodeType = {
            if ("Flg".equals(this.name)) { return ClassificationCodeType.Number; }
            if ("MemberStatus".equals(this.name)) { return ClassificationCodeType.String; }
            if ("ServiceRank".equals(this.name)) { return ClassificationCodeType.Number; }
            if ("Region".equals(this.name)) { return ClassificationCodeType.Number; }
            if ("WithdrawalReason".equals(this.name)) { return ClassificationCodeType.String; }
            if ("ProductCategory".equals(this.name)) { return ClassificationCodeType.String; }
            if ("ProductStatus".equals(this.name)) { return ClassificationCodeType.String; }
            return ClassificationCodeType.String; // as default
        }

        def undefinedHandlingType(): ClassificationUndefinedHandlingType = {
            if ("Flg".equals(this.name)) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("MemberStatus".equals(this.name)) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("ServiceRank".equals(this.name)) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("Region".equals(this.name)) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("WithdrawalReason".equals(this.name)) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("ProductCategory".equals(this.name)) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            if ("ProductStatus".equals(this.name)) { return ClassificationUndefinedHandlingType.EXCEPTION; }
            return ClassificationUndefinedHandlingType.LOGGING; // as default
        }
    }

    object DefMeta {

        /** general boolean classification for every flg-column */
        case object Flg extends DefMeta("Flg");
        /** status of member from entry to withdrawal */
        case object MemberStatus extends DefMeta("MemberStatus");
        /** rank of service member gets */
        case object ServiceRank extends DefMeta("ServiceRank");
        /** mainly region of member address */
        case object Region extends DefMeta("Region");
        /** reason for member withdrawal */
        case object WithdrawalReason extends DefMeta("WithdrawalReason");
        /** category of product. self reference */
        case object ProductCategory extends DefMeta("ProductCategory");
        /** status for product */
        case object ProductStatus extends DefMeta("ProductStatus");
    }

    // ===================================================================================
    //                                                                        Scala Helper
    //                                                                        ============
    protected def toScalaList[ENTITY](javaList: Collection[ENTITY]): immutable.List[ENTITY] = {
        return javaList.toArray.toList.asInstanceOf[immutable.List[ENTITY]];
    }
}
