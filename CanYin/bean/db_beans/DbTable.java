package db_beans;
import java.io.Serializable;
import java.sql.Date;

import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Table;

/**
 * Model class of db_table.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Table("db_table")
public class DbTable implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** ID. */
	@Id
	private Integer id;

	/** alias. */
	private String alias;

	/** tablename. */
	private String tablename;

	/** type. */
	private String type;

	/** position. */
	private String position;

	/** limit. */
	private Float limit;

	/** allow. */
	private Integer allow;

	/** state. */
	private String state;

	/** isorder. */
	private Integer isorder;

	/** SalesID. */
	private String salesid;

	/** waiter. */
	private Integer waiter;

	/** prepay. */
	private Float prepay;

	/** starttime. */
	private Date starttime;

	/** finishtime. */
	private Date finishtime;

	/** desrc. */
	private String desrc;

	/** reserve. */
	private String reserve;

	/** permission. */
	private Integer permission;

	/**
	 * Constructor.
	 */
	public DbTable() {
	}

	/**
	 * Set the ID.
	 * 
	 * @param id
	 *            ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the ID.
	 * 
	 * @return ID
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Set the alias.
	 * 
	 * @param alias
	 *            alias
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * Get the alias.
	 * 
	 * @return alias
	 */
	public String getAlias() {
		return this.alias;
	}

	/**
	 * Set the tablename.
	 * 
	 * @param tablename
	 *            tablename
	 */
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	/**
	 * Get the tablename.
	 * 
	 * @return tablename
	 */
	public String getTablename() {
		return this.tablename;
	}

	/**
	 * Set the type.
	 * 
	 * @param type
	 *            type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Get the type.
	 * 
	 * @return type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Set the position.
	 * 
	 * @param position
	 *            position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * Get the position.
	 * 
	 * @return position
	 */
	public String getPosition() {
		return this.position;
	}

	/**
	 * Set the limit.
	 * 
	 * @param limit
	 *            limit
	 */
	public void setLimit(Float limit) {
		this.limit = limit;
	}

	/**
	 * Get the limit.
	 * 
	 * @return limit
	 */
	public Float getLimit() {
		return this.limit;
	}

	/**
	 * Set the allow.
	 * 
	 * @param allow
	 *            allow
	 */
	public void setAllow(Integer allow) {
		this.allow = allow;
	}

	/**
	 * Get the allow.
	 * 
	 * @return allow
	 */
	public Integer getAllow() {
		return this.allow;
	}

	/**
	 * Set the state.
	 * 
	 * @param state
	 *            state
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Get the state.
	 * 
	 * @return state
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * Set the isorder.
	 * 
	 * @param isorder
	 *            isorder
	 */
	public void setIsorder(Integer isorder) {
		this.isorder = isorder;
	}

	/**
	 * Get the isorder.
	 * 
	 * @return isorder
	 */
	public Integer getIsorder() {
		return this.isorder;
	}

	/**
	 * Set the SalesID.
	 * 
	 * @param salesid
	 *            SalesID
	 */
	public void setSalesid(String salesid) {
		this.salesid = salesid;
	}

	/**
	 * Get the SalesID.
	 * 
	 * @return SalesID
	 */
	public String getSalesid() {
		return this.salesid;
	}

	/**
	 * Set the waiter.
	 * 
	 * @param water
	 *            waiter
	 */
	public void setWaiter(Integer waiter) {
		this.waiter = waiter;
	}

	/**
	 * Get the waiter.
	 * 
	 * @return waiter
	 */
	public Integer getWaiter() {
		return this.waiter;
	}

	/**
	 * Set the prepay.
	 * 
	 * @param prepay
	 *            prepay
	 */
	public void setPrepay(Float prepay) {
		this.prepay = prepay;
	}

	/**
	 * Get the prepay.
	 * 
	 * @return prepay
	 */
	public Float getPrepay() {
		return this.prepay;
	}

	/**
	 * Set the starttime.
	 * 
	 * @param starttime
	 *            starttime
	 */
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	/**
	 * Get the starttime.
	 * 
	 * @return starttime
	 */
	public Date getStarttime() {
		return this.starttime;
	}

	/**
	 * Set the finishtime.
	 * 
	 * @param finishtime
	 *            finishtime
	 */
	public void setFinishtime(Date finishtime) {
		this.finishtime = finishtime;
	}

	/**
	 * Get the finishtime.
	 * 
	 * @return finishtime
	 */
	public Date getFinishtime() {
		return this.finishtime;
	}

	/**
	 * Set the desrc.
	 * 
	 * @param desrc
	 *            desrc
	 */
	public void setDesrc(String desrc) {
		this.desrc = desrc;
	}

	/**
	 * Get the desrc.
	 * 
	 * @return desrc
	 */
	public String getDesrc() {
		return this.desrc;
	}

	/**
	 * Set the reserve.
	 * 
	 * @param reserve
	 *            reserve
	 */
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	/**
	 * Get the reserve.
	 * 
	 * @return reserve
	 */
	public String getReserve() {
		return this.reserve;
	}

	/**
	 * Set the permission.
	 * 
	 * @param permission
	 *            permission
	 */
	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	/**
	 * Get the permission.
	 * 
	 * @return permission
	 */
	public Integer getPermission() {
		return this.permission;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		DbTable other = (DbTable) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}